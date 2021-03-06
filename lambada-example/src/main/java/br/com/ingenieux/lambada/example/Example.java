/*
 * Copyright (c) 2016 ingenieux Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.ingenieux.lambada.example;

import com.amazonaws.services.lambda.runtime.Context;
import io.ingenieux.lambada.runtime.LambadaFunction;

public class Example {
    @LambadaFunction(timeout=15)
    public String sayHello(String whom, Context ctx) {
        return String.format("Hello, %s!", whom);
    }
}
