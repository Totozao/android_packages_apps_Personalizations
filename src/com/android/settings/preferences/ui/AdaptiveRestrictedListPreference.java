/*
 * Copyright (C) 2023 The risingOS Android Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.settings.preferences.ui;

import android.content.Context;
import android.os.Process;
import android.os.UserHandle;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.PreferenceManager;
import androidx.preference.PreferenceViewHolder;
import android.view.View;

import com.android.settings.R;
import com.android.settings.preferences.ui.AdaptivePreferenceUtils;

import com.android.settings.RestrictedListPreference;

public class AdaptiveRestrictedListPreference extends RestrictedListPreference {

    public AdaptiveRestrictedListPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayoutResource(AdaptivePreferenceUtils.getLayoutResourceId(context, attrs));
    }
}
