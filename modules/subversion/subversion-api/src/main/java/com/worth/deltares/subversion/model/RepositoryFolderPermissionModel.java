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

package com.worth.deltares.subversion.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RepositoryFolderPermission service. Represents a row in the &quot;deltares_RepositoryFolderPermission&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.worth.deltares.subversion.model.impl.RepositoryFolderPermissionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.worth.deltares.subversion.model.impl.RepositoryFolderPermissionImpl}.
 * </p>
 *
 * @author Pier-Angelo Gaetani @ Worth Systems
 * @see RepositoryFolderPermission
 * @see com.worth.deltares.subversion.model.impl.RepositoryFolderPermissionImpl
 * @see com.worth.deltares.subversion.model.impl.RepositoryFolderPermissionModelImpl
 * @generated
 */
@ProviderType
public interface RepositoryFolderPermissionModel extends BaseModel<RepositoryFolderPermission> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a repository folder permission model instance should use the {@link RepositoryFolderPermission} interface instead.
	 */

	/**
	 * Returns the primary key of this repository folder permission.
	 *
	 * @return the primary key of this repository folder permission
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this repository folder permission.
	 *
	 * @param primaryKey the primary key of this repository folder permission
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the permission ID of this repository folder permission.
	 *
	 * @return the permission ID of this repository folder permission
	 */
	public long getPermissionId();

	/**
	 * Sets the permission ID of this repository folder permission.
	 *
	 * @param permissionId the permission ID of this repository folder permission
	 */
	public void setPermissionId(long permissionId);

	/**
	 * Returns the folder ID of this repository folder permission.
	 *
	 * @return the folder ID of this repository folder permission
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this repository folder permission.
	 *
	 * @param folderId the folder ID of this repository folder permission
	 */
	public void setFolderId(long folderId);

	/**
	 * Returns the permission of this repository folder permission.
	 *
	 * @return the permission of this repository folder permission
	 */
	@AutoEscape
	public String getPermission();

	/**
	 * Sets the permission of this repository folder permission.
	 *
	 * @param permission the permission of this repository folder permission
	 */
	public void setPermission(String permission);

	/**
	 * Returns the recurse of this repository folder permission.
	 *
	 * @return the recurse of this repository folder permission
	 */
	public boolean getRecurse();

	/**
	 * Returns <code>true</code> if this repository folder permission is recurse.
	 *
	 * @return <code>true</code> if this repository folder permission is recurse; <code>false</code> otherwise
	 */
	public boolean isRecurse();

	/**
	 * Sets whether this repository folder permission is recurse.
	 *
	 * @param recurse the recurse of this repository folder permission
	 */
	public void setRecurse(boolean recurse);

	/**
	 * Returns the entity type of this repository folder permission.
	 *
	 * @return the entity type of this repository folder permission
	 */
	@AutoEscape
	public String getEntityType();

	/**
	 * Sets the entity type of this repository folder permission.
	 *
	 * @param entityType the entity type of this repository folder permission
	 */
	public void setEntityType(String entityType);

	/**
	 * Returns the entity ID of this repository folder permission.
	 *
	 * @return the entity ID of this repository folder permission
	 */
	public long getEntityId();

	/**
	 * Sets the entity ID of this repository folder permission.
	 *
	 * @param entityId the entity ID of this repository folder permission
	 */
	public void setEntityId(long entityId);

	/**
	 * Returns the create date of this repository folder permission.
	 *
	 * @return the create date of this repository folder permission
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this repository folder permission.
	 *
	 * @param createDate the create date of this repository folder permission
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this repository folder permission.
	 *
	 * @return the modified date of this repository folder permission
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this repository folder permission.
	 *
	 * @param modifiedDate the modified date of this repository folder permission
	 */
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(RepositoryFolderPermission repositoryFolderPermission);

	@Override
	public int hashCode();

	@Override
	public CacheModel<RepositoryFolderPermission> toCacheModel();

	@Override
	public RepositoryFolderPermission toEscapedModel();

	@Override
	public RepositoryFolderPermission toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}