/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.worth.deltares.subversion.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for RepositoryLog. This utility wraps
 * {@link com.worth.deltares.subversion.service.impl.RepositoryLogServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Pier-Angelo Gaetani @ Worth Systems
 * @see RepositoryLogService
 * @see com.worth.deltares.subversion.service.base.RepositoryLogServiceBaseImpl
 * @see com.worth.deltares.subversion.service.impl.RepositoryLogServiceImpl
 * @generated
 */
@ProviderType
public class RepositoryLogServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.worth.deltares.subversion.service.impl.RepositoryLogServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.json.JSONArray getLastLogs(
		java.lang.Integer number) {
		return getService().getLastLogs(number);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static RepositoryLogService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RepositoryLogService, RepositoryLogService> _serviceTracker =
		ServiceTrackerFactory.open(RepositoryLogService.class);
}