/**
 * <pre>
 * Copyright (C) 2015  Soulwolf android-dialog-builder
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </pre>
 */
package net.soulwolf.widget.dialogbuilder;

import android.content.Context;
import android.util.DisplayMetrics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * author : Soulwolf Create by 2015/8/5 16:16
 * email  : ToakerQin@gmail.com.
 */
final class Utils {

    static <ITEM> List<ITEM> asList(ITEM [] array){
        if(array == null){
            return new ArrayList<ITEM>();
        }
        return Arrays.asList(array);
    }

    static <ITEM> List<ITEM> checkList(List<ITEM> list){
        if(list == null){
            return new ArrayList<ITEM>();
        }
        return list;
    }

    static int getStatusBarHeight(Context context){
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return  (int) Math.ceil( 17 * metrics.density);
    }
}
