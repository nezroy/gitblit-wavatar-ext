/*
 * Copyright 2014 gitblit.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gitblit.ext.wavatar;

import java.text.MessageFormat;

import com.google.inject.Singleton;

import com.gitblit.utils.StringUtils;
import com.gitblit.AvatarGenerator;

@Singleton
public class WavatarGenerator implements AvatarGenerator {

	@Override
	public String getURL(String username, String emailaddress, boolean identicon, int width) {
		String email = emailaddress == null ? username : emailaddress;
		if (width <= 0) {
			width = 50;
		}
		String emailHash = StringUtils.getMD5(email.toLowerCase());
		String url = MessageFormat.format("https://www.gravatar.com/avatar/{0}?s={1,number,0}&d=wavatar", emailHash, width);
		return url;
	}

}
