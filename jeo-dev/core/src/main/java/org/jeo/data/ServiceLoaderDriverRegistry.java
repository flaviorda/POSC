/* Copyright 2013 The jeo project. All rights reserved.
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
package org.jeo.data;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Loads drivers with {@link ServiceLoader}.
 * <p>
 * This registry picks up drivers registered via the file META-INF/services/org.jeo.data.Driver.
 * </p>
 *
 * @author Justin Deoliveira, OpenGeo
 */
public class ServiceLoaderDriverRegistry implements DriverRegistry {

    @Override
    public Iterator<Driver<?>> list() {
        return (Iterator) ServiceLoader.load(Driver.class).iterator();
    }

}
