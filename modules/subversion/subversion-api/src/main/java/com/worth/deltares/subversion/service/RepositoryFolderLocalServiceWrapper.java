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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RepositoryFolderLocalService}.
 *
 * @author Pier-Angelo Gaetani @ Worth Systems
 * @see RepositoryFolderLocalService
 * @generated
 */
@ProviderType
public class RepositoryFolderLocalServiceWrapper
	implements RepositoryFolderLocalService,
		ServiceWrapper<RepositoryFolderLocalService> {
	public RepositoryFolderLocalServiceWrapper(
		RepositoryFolderLocalService repositoryFolderLocalService) {
		_repositoryFolderLocalService = repositoryFolderLocalService;
	}

	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder addRepositoryFolder(
		long repositoryId, java.lang.String name) {
		return _repositoryFolderLocalService.addRepositoryFolder(repositoryId,
			name);
	}

	/**
	* Adds the repository folder to the database. Also notifies the appropriate model listeners.
	*
	* @param repositoryFolder the repository folder
	* @return the repository folder that was added
	* @throws SystemException
	*/
	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder addRepositoryFolder(
		com.worth.deltares.subversion.model.RepositoryFolder repositoryFolder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _repositoryFolderLocalService.addRepositoryFolder(repositoryFolder);
	}

	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder createRepositoryFolder() {
		return _repositoryFolderLocalService.createRepositoryFolder();
	}

	/**
	* Creates a new repository folder with the primary key. Does not add the repository folder to the database.
	*
	* @param folderId the primary key for the new repository folder
	* @return the new repository folder
	*/
	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder createRepositoryFolder(
		long folderId) {
		return _repositoryFolderLocalService.createRepositoryFolder(folderId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repositoryFolderLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the repository folder with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param folderId the primary key of the repository folder
	* @return the repository folder that was removed
	* @throws PortalException if a repository folder with the primary key could not be found
	*/
	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder deleteRepositoryFolder(
		long folderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repositoryFolderLocalService.deleteRepositoryFolder(folderId);
	}

	/**
	* Deletes the repository folder from the database. Also notifies the appropriate model listeners.
	*
	* @param repositoryFolder the repository folder
	* @return the repository folder that was removed
	* @throws SystemException
	*/
	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder deleteRepositoryFolder(
		com.worth.deltares.subversion.model.RepositoryFolder repositoryFolder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _repositoryFolderLocalService.deleteRepositoryFolder(repositoryFolder);
	}

	@Override
	public void deleteRepositoryFolders(
		java.util.List<com.worth.deltares.subversion.model.RepositoryFolder> folders) {
		_repositoryFolderLocalService.deleteRepositoryFolders(folders);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _repositoryFolderLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _repositoryFolderLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.worth.deltares.subversion.model.impl.RepositoryFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _repositoryFolderLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.worth.deltares.subversion.model.impl.RepositoryFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _repositoryFolderLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _repositoryFolderLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _repositoryFolderLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder fetchRepositoryFolder(
		long folderId) {
		return _repositoryFolderLocalService.fetchRepositoryFolder(folderId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _repositoryFolderLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _repositoryFolderLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _repositoryFolderLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repositoryFolderLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the repository folder with the primary key.
	*
	* @param folderId the primary key of the repository folder
	* @return the repository folder
	* @throws PortalException if a repository folder with the primary key could not be found
	*/
	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder getRepositoryFolder(
		long folderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repositoryFolderLocalService.getRepositoryFolder(folderId);
	}

	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder getRepositoryFolder(
		long repositoryId, java.lang.String name) {
		return _repositoryFolderLocalService.getRepositoryFolder(repositoryId,
			name);
	}

	@Override
	public java.util.List<com.worth.deltares.subversion.model.RepositoryFolder> getRepositoryFolderChildren(
		com.worth.deltares.subversion.model.RepositoryFolder folder) {
		return _repositoryFolderLocalService.getRepositoryFolderChildren(folder);
	}

	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder getRepositoryFolderParent(
		long repositoryId, java.lang.String folderName) {
		return _repositoryFolderLocalService.getRepositoryFolderParent(repositoryId,
			folderName);
	}

	/**
	* Returns a range of all the repository folders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.worth.deltares.subversion.model.impl.RepositoryFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of repository folders
	* @param end the upper bound of the range of repository folders (not inclusive)
	* @return the range of repository folders
	*/
	@Override
	public java.util.List<com.worth.deltares.subversion.model.RepositoryFolder> getRepositoryFolders(
		int start, int end) {
		return _repositoryFolderLocalService.getRepositoryFolders(start, end);
	}

	@Override
	public java.util.List<com.worth.deltares.subversion.model.RepositoryFolder> getRepositoryFolders(
		long repositoryId) {
		return _repositoryFolderLocalService.getRepositoryFolders(repositoryId);
	}

	@Deprecated
	@Override
	public java.util.List<com.worth.deltares.subversion.model.RepositoryFolder> getRepositoryFolders(
		long repositoryId, java.lang.String name) {
		return _repositoryFolderLocalService.getRepositoryFolders(repositoryId,
			name);
	}

	/**
	* Returns the number of repository folders.
	*
	* @return the number of repository folders
	*/
	@Override
	public int getRepositoryFoldersCount() {
		return _repositoryFolderLocalService.getRepositoryFoldersCount();
	}

	/**
	* Updates the repository folder in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param repositoryFolder the repository folder
	* @return the repository folder that was updated
	*/
	@Override
	public com.worth.deltares.subversion.model.RepositoryFolder updateRepositoryFolder(
		com.worth.deltares.subversion.model.RepositoryFolder repositoryFolder) {
		return _repositoryFolderLocalService.updateRepositoryFolder(repositoryFolder);
	}

	@Override
	public RepositoryFolderLocalService getWrappedService() {
		return _repositoryFolderLocalService;
	}

	@Override
	public void setWrappedService(
		RepositoryFolderLocalService repositoryFolderLocalService) {
		_repositoryFolderLocalService = repositoryFolderLocalService;
	}

	private RepositoryFolderLocalService _repositoryFolderLocalService;
}