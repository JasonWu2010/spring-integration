/*
 * Copyright 2002-2007 the original author or authors.
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

package org.springframework.integration.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Namespace handler for the integration namespace.
 * 
 * @author Mark Fisher
 */
public class IntegrationNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		registerBeanDefinitionParser("message-bus", new MessageBusParser());
		registerBeanDefinitionParser("annotation-driven", new AnnotationDrivenParser());
		registerBeanDefinitionParser("channel", new ChannelParser());
		registerBeanDefinitionParser("inbound-channel-adapter", new ChannelAdapterParser(true));
		registerBeanDefinitionParser("outbound-channel-adapter", new ChannelAdapterParser(false));
		registerBeanDefinitionParser("endpoint", new EndpointParser());
	}

}
