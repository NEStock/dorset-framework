/*
 * Copyright 2016 The Johns Hopkins University Applied Physics Laboratory LLC
 * All rights reserved.
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
package edu.jhuapl.dorset.routing;

import edu.jhuapl.dorset.Request;
import edu.jhuapl.dorset.agents.Agent;

/**
 * Route requests to agents for request handling
 */
public interface Router {

    /**
     * Get an array of agents to send the request to
     *
     * @param request  the request object
     * @return array of agents (empty array if no agent found)
     */
    public Agent[] route(Request request);

    /**
     * Get an array of the agents for this router
     *
     * @return array of agents
     */
    public Agent[] getAgents();
}
