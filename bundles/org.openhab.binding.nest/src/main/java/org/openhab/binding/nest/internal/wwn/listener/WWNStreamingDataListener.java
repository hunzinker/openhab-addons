/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.nest.internal.wwn.listener;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.nest.internal.wwn.dto.WWNTopLevelData;
import org.openhab.binding.nest.internal.wwn.rest.WWNStreamingRestClient;

/**
 * Interface for listeners of events generated by the {@link WWNStreamingRestClient}.
 *
 * @author Wouter Born - Initial contribution
 * @author Wouter Born - Replace polling with REST streaming
 */
@NonNullByDefault
public interface WWNStreamingDataListener {

    /**
     * Authorization has been revoked for a token.
     */
    void onAuthorizationRevoked(String token);

    /**
     * The client successfully established a connection.
     */
    void onConnected();

    /**
     * The client was disconnected.
     */
    void onDisconnected();

    /**
     * An error message was published.
     */
    void onError(String message);

    /**
     * Initial {@link WWNTopLevelData} or an update is sent.
     */
    void onNewTopLevelData(WWNTopLevelData data);
}