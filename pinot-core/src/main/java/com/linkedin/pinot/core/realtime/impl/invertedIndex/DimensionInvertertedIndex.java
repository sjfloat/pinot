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
package com.linkedin.pinot.core.realtime.impl.invertedIndex;

import java.util.HashMap;
import java.util.Map;

import org.roaringbitmap.buffer.MutableRoaringBitmap;


public class DimensionInvertertedIndex implements RealtimeInvertedIndex {

  private Map<Integer, MutableRoaringBitmap> invertedIndex;

  public DimensionInvertertedIndex(String columnName) {
    invertedIndex = new HashMap<Integer, MutableRoaringBitmap>();
  }

  @Override
  public void add(Object dictId, int docId) {
    if (!invertedIndex.containsKey(dictId))
      invertedIndex.put((Integer) dictId, new MutableRoaringBitmap());

    invertedIndex.get((Integer) dictId).add(docId);
  }

  @Override
  public MutableRoaringBitmap getDocIdSetFor(Object dicId) {
    return invertedIndex.get(dicId);
  }

}