/*
 * Copyright (c) 2010 Tonic Solutions LLC.
 *
 * http://www.nimbits.com
 *
 *
 * Licensed under the GNU GENERAL PUBLIC LICENSE, Version 3.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/gpl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the license is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, eitherexpress or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.nimbits.client.model;

import com.extjs.gxt.ui.client.data.*;
import com.nimbits.client.enums.*;
import com.nimbits.client.model.feed.*;

import java.io.*;

/**
 * Created by Benjamin Sautner
 * User: bsautner
 * Date: 2/24/12
 * Time: 2:47 PM
 */
public class GxtFeedModel extends BaseTreeModel implements Serializable {
    private String html;


    public GxtFeedModel(FeedValue v) {
        this.html = v.getFeedHtml();
        set(Parameters.html.getText(),html);
        set(Parameters.entityType.getText(),v.getFeedType().getCode());

    }

    public String getHtml() {
        return html;
    }
}
