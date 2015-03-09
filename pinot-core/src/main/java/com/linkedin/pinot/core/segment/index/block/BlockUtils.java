/**
 * Copyright (C) 2014-2015 LinkedIn Corp. (pinot-core@linkedin.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linkedin.pinot.core.segment.index.block;

import java.util.Iterator;

import org.roaringbitmap.buffer.MutableRoaringBitmap;

import com.linkedin.pinot.core.common.BlockDocIdIterator;
import com.linkedin.pinot.core.common.BlockDocIdSet;
import com.linkedin.pinot.core.common.Constants;


public class BlockUtils {

  public static BlockDocIdSet getBLockDocIdSetBackedByBitmap(final MutableRoaringBitmap filteredDocIdsBitMap) {
    return new BlockDocIdSet() {
      @Override
      public BlockDocIdIterator iterator() {

        return new BlockDocIdIterator() {
          final Iterator<Integer> docIds = filteredDocIdsBitMap.iterator();
          int current = 0;

          @Override
          public int skipTo(int targetDocId) {
            throw new UnsupportedOperationException();
          }

          @Override
          public int next() {
            if (docIds.hasNext()) {
              current = docIds.next();
            } else {
              current = Constants.EOF;
            }
            return current;
          }

          @Override
          public int currentDocId() {
            return current;
          }
        };
      }

      @Override
      public Object getRaw() {
        return filteredDocIdsBitMap;
      }
    };
  }

  public static BlockDocIdSet getDummyBlockDocIdSet(final int maxDocId) {

    return new BlockDocIdSet() {
      @Override
      public BlockDocIdIterator iterator() {

        return new BlockDocIdIterator() {
          int counter = 0;

          @Override
          public int skipTo(int targetDocId) {
            if (targetDocId < maxDocId) {
              counter = targetDocId;
              return counter;
            } else {
              return Constants.EOF;
            }
          }

          @Override
          public int next() {
            if (counter >= maxDocId) {
              return Constants.EOF;
            }
            return counter++;
          }

          @Override
          public int currentDocId() {
            return counter;
          }
        };
      }

      @Override
      public Object getRaw() {
        MutableRoaringBitmap bitmap = new MutableRoaringBitmap();
        for (int i = 0; i < maxDocId; i++) {
          bitmap.add(i);
        }
        return bitmap;
      }
    };
  }
}