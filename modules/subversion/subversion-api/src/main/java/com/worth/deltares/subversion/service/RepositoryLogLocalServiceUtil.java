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
 * Provides the local service utility for RepositoryLog. This utility wraps
 * {@link com.worth.deltares.subversion.service.impl.RepositoryLogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Pier-Angelo Gaetani @ Worth Systems
 * @see RepositoryLogLocalService
 * @see com.worth.deltares.subversion.service.base.RepositoryLogLocalServiceBaseImpl
 * @see com.worth.deltares.subversion.service.impl.RepositoryLogLocalServiceImpl
 * @generated
 */
@ProviderType
public class RepositoryLogLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.worth.deltares.subversion.service.impl.RepositoryLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the repository log to the database. Also notifies the appropriate model listeners.
	*
	* @param repositoryLog the repository log
	* @return the repository log that was added
	*/
	public static com.worth.deltares.subversion.model.RepositoryLog addRepositoryLog(
		com.worth.deltares.subversion.model.RepositoryLog repositoryLog) {
		return getService().addRepositoryLog(repositoryLog);
	}

	/**
	* Creates a new repository log with the primary key. Does not add the repository log to the database.
	*
	* @param logId the primary key for the new repository log
	* @return the new repository log
	*/
	public static com.worth.deltares.subversion.model.RepositoryLog createRepositoryLog(
		long logId) {
		return getService().createRepositoryLog(logId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the repository log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logId the primary key of the repository log
	* @return the repository log that was removed
	* @throws PortalException if a repository log with the primary key could not be found
	*/
	public static com.worth.deltares.subversion.model.RepositoryLog deleteRepositoryLog(
		long logId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteRepositoryLog(logId);
	}

	/**
	* Deletes the repository log from the database. Also notifies the appropriate model listeners.
	*
	* @param repositoryLog the repository log
	* @return the repository log that was removed
	*/
	public static com.worth.deltares.subversion.model.RepositoryLog deleteRepositoryLog(
		com.worth.deltares.subversion.model.RepositoryLog repositoryLog) {
		return getService().deleteRepositoryLog(repositoryLog);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.worth.deltares.subversion.model.impl.RepositoryLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.worth.deltares.subversion.model.impl.RepositoryLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.worth.deltares.subversion.model.RepositoryLog fetchRepositoryLog(
		long logId) {
		return getService().fetchRepositoryLog(logId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

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

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the repository log with the primary key.
	*
	* @param logId the primary key of the repository log
	* @return the repository log
	* @throws PortalException if a repository log with the primary key could not be found
	*/
	public static com.worth.deltares.subversion.model.RepositoryLog getRepositoryLog(
		long logId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRepositoryLog(logId);
	}

	/**
	* Returns a range of all the repository logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.worth.deltares.subversion.model.impl.RepositoryLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of repository logs
	* @param end the upper bound of the range of repository logs (not inclusive)
	* @return the range of repository logs
	*/
	public static java.util.List<com.worth.deltares.subversion.model.RepositoryLog> getRepositoryLogs(
		int start, int end) {
		return getService().getRepositoryLogs(start, end);
	}

	/**
	* Returns the number of repository logs.
	*
	* @return the number of repository logs
	*/
	public static int getRepositoryLogsCount() {
		return getService().getRepositoryLogsCount();
	}

	public static int getRepositoryLogsCount(java.lang.String action) {
		return getService().getRepositoryLogsCount(action);
	}

	public static int getRepositoryLogsCount(java.lang.String repository,
		java.lang.String action) {
		return getService().getRepositoryLogsCount(repository, action);
	}

	public static int getRepositoryLogsCount(java.lang.String screenName,
		java.lang.String ipAddress, java.lang.String repository) {
		return getService()
				   .getRepositoryLogsCount(screenName, ipAddress, repository);
	}

	/**
	* Updates the repository log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param repositoryLog the repository log
	* @return the repository log that was updated
	*/
	public static com.worth.deltares.subversion.model.RepositoryLog updateRepositoryLog(
		com.worth.deltares.subversion.model.RepositoryLog repositoryLog) {
		return getService().updateRepositoryLog(repositoryLog);
	}

	public static RepositoryLogLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RepositoryLogLocalService, RepositoryLogLocalService> _serviceTracker =
		ServiceTrackerFactory.open(RepositoryLogLocalService.class);
}