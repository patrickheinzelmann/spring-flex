/*
 * Copyright 2002-2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.flex.messaging;

import flex.messaging.MessageDestination;
import flex.messaging.messages.AsyncMessage;

/**
 * Factory interface for the creation of AMF messages to be sent to a {@link MessageDestination}
 * 
 * @author Jeremy Grelle
 */
public interface AsyncMessageCreator {

    /**
     * Create a new {@link AsyncMessage} for sending to a {@link MessageDestination}
     * 
     * @return the created message
     */
    AsyncMessage createMessage();
}