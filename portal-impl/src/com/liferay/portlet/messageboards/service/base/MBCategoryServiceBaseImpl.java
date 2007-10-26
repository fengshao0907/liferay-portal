/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.messageboards.service.base;

import com.liferay.portal.service.impl.PrincipalBean;

import com.liferay.portlet.messageboards.service.MBBanLocalService;
import com.liferay.portlet.messageboards.service.MBBanLocalServiceFactory;
import com.liferay.portlet.messageboards.service.MBBanService;
import com.liferay.portlet.messageboards.service.MBBanServiceFactory;
import com.liferay.portlet.messageboards.service.MBCategoryLocalService;
import com.liferay.portlet.messageboards.service.MBCategoryLocalServiceFactory;
import com.liferay.portlet.messageboards.service.MBCategoryService;
import com.liferay.portlet.messageboards.service.MBMessageFlagLocalService;
import com.liferay.portlet.messageboards.service.MBMessageFlagLocalServiceFactory;
import com.liferay.portlet.messageboards.service.MBMessageLocalService;
import com.liferay.portlet.messageboards.service.MBMessageLocalServiceFactory;
import com.liferay.portlet.messageboards.service.MBMessageService;
import com.liferay.portlet.messageboards.service.MBMessageServiceFactory;
import com.liferay.portlet.messageboards.service.MBStatsUserLocalService;
import com.liferay.portlet.messageboards.service.MBStatsUserLocalServiceFactory;
import com.liferay.portlet.messageboards.service.MBThreadLocalService;
import com.liferay.portlet.messageboards.service.MBThreadLocalServiceFactory;
import com.liferay.portlet.messageboards.service.persistence.MBBanPersistence;
import com.liferay.portlet.messageboards.service.persistence.MBBanUtil;
import com.liferay.portlet.messageboards.service.persistence.MBCategoryPersistence;
import com.liferay.portlet.messageboards.service.persistence.MBCategoryUtil;
import com.liferay.portlet.messageboards.service.persistence.MBDiscussionPersistence;
import com.liferay.portlet.messageboards.service.persistence.MBDiscussionUtil;
import com.liferay.portlet.messageboards.service.persistence.MBMessageFlagPersistence;
import com.liferay.portlet.messageboards.service.persistence.MBMessageFlagUtil;
import com.liferay.portlet.messageboards.service.persistence.MBMessagePersistence;
import com.liferay.portlet.messageboards.service.persistence.MBMessageUtil;
import com.liferay.portlet.messageboards.service.persistence.MBStatsUserPersistence;
import com.liferay.portlet.messageboards.service.persistence.MBStatsUserUtil;
import com.liferay.portlet.messageboards.service.persistence.MBThreadPersistence;
import com.liferay.portlet.messageboards.service.persistence.MBThreadUtil;

import org.springframework.beans.factory.InitializingBean;

/**
 * <a href="MBCategoryServiceBaseImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public abstract class MBCategoryServiceBaseImpl extends PrincipalBean
	implements MBCategoryService, InitializingBean {
	public MBBanLocalService getMBBanLocalService() {
		return mbBanLocalService;
	}

	public void setMBBanLocalService(MBBanLocalService mbBanLocalService) {
		this.mbBanLocalService = mbBanLocalService;
	}

	public MBBanService getMBBanService() {
		return mbBanService;
	}

	public void setMBBanService(MBBanService mbBanService) {
		this.mbBanService = mbBanService;
	}

	public MBBanPersistence getMBBanPersistence() {
		return mbBanPersistence;
	}

	public void setMBBanPersistence(MBBanPersistence mbBanPersistence) {
		this.mbBanPersistence = mbBanPersistence;
	}

	public MBCategoryLocalService getMBCategoryLocalService() {
		return mbCategoryLocalService;
	}

	public void setMBCategoryLocalService(
		MBCategoryLocalService mbCategoryLocalService) {
		this.mbCategoryLocalService = mbCategoryLocalService;
	}

	public MBCategoryPersistence getMBCategoryPersistence() {
		return mbCategoryPersistence;
	}

	public void setMBCategoryPersistence(
		MBCategoryPersistence mbCategoryPersistence) {
		this.mbCategoryPersistence = mbCategoryPersistence;
	}

	public MBDiscussionPersistence getMBDiscussionPersistence() {
		return mbDiscussionPersistence;
	}

	public void setMBDiscussionPersistence(
		MBDiscussionPersistence mbDiscussionPersistence) {
		this.mbDiscussionPersistence = mbDiscussionPersistence;
	}

	public MBMessageLocalService getMBMessageLocalService() {
		return mbMessageLocalService;
	}

	public void setMBMessageLocalService(
		MBMessageLocalService mbMessageLocalService) {
		this.mbMessageLocalService = mbMessageLocalService;
	}

	public MBMessageService getMBMessageService() {
		return mbMessageService;
	}

	public void setMBMessageService(MBMessageService mbMessageService) {
		this.mbMessageService = mbMessageService;
	}

	public MBMessagePersistence getMBMessagePersistence() {
		return mbMessagePersistence;
	}

	public void setMBMessagePersistence(
		MBMessagePersistence mbMessagePersistence) {
		this.mbMessagePersistence = mbMessagePersistence;
	}

	public MBMessageFlagLocalService getMBMessageFlagLocalService() {
		return mbMessageFlagLocalService;
	}

	public void setMBMessageFlagLocalService(
		MBMessageFlagLocalService mbMessageFlagLocalService) {
		this.mbMessageFlagLocalService = mbMessageFlagLocalService;
	}

	public MBMessageFlagPersistence getMBMessageFlagPersistence() {
		return mbMessageFlagPersistence;
	}

	public void setMBMessageFlagPersistence(
		MBMessageFlagPersistence mbMessageFlagPersistence) {
		this.mbMessageFlagPersistence = mbMessageFlagPersistence;
	}

	public MBStatsUserLocalService getMBStatsUserLocalService() {
		return mbStatsUserLocalService;
	}

	public void setMBStatsUserLocalService(
		MBStatsUserLocalService mbStatsUserLocalService) {
		this.mbStatsUserLocalService = mbStatsUserLocalService;
	}

	public MBStatsUserPersistence getMBStatsUserPersistence() {
		return mbStatsUserPersistence;
	}

	public void setMBStatsUserPersistence(
		MBStatsUserPersistence mbStatsUserPersistence) {
		this.mbStatsUserPersistence = mbStatsUserPersistence;
	}

	public MBThreadLocalService getMBThreadLocalService() {
		return mbThreadLocalService;
	}

	public void setMBThreadLocalService(
		MBThreadLocalService mbThreadLocalService) {
		this.mbThreadLocalService = mbThreadLocalService;
	}

	public MBThreadPersistence getMBThreadPersistence() {
		return mbThreadPersistence;
	}

	public void setMBThreadPersistence(MBThreadPersistence mbThreadPersistence) {
		this.mbThreadPersistence = mbThreadPersistence;
	}

	public void afterPropertiesSet() {
		if (mbBanLocalService == null) {
			mbBanLocalService = MBBanLocalServiceFactory.getImpl();
		}

		if (mbBanService == null) {
			mbBanService = MBBanServiceFactory.getImpl();
		}

		if (mbBanPersistence == null) {
			mbBanPersistence = MBBanUtil.getPersistence();
		}

		if (mbCategoryLocalService == null) {
			mbCategoryLocalService = MBCategoryLocalServiceFactory.getImpl();
		}

		if (mbCategoryPersistence == null) {
			mbCategoryPersistence = MBCategoryUtil.getPersistence();
		}

		if (mbDiscussionPersistence == null) {
			mbDiscussionPersistence = MBDiscussionUtil.getPersistence();
		}

		if (mbMessageLocalService == null) {
			mbMessageLocalService = MBMessageLocalServiceFactory.getImpl();
		}

		if (mbMessageService == null) {
			mbMessageService = MBMessageServiceFactory.getImpl();
		}

		if (mbMessagePersistence == null) {
			mbMessagePersistence = MBMessageUtil.getPersistence();
		}

		if (mbMessageFlagLocalService == null) {
			mbMessageFlagLocalService = MBMessageFlagLocalServiceFactory.getImpl();
		}

		if (mbMessageFlagPersistence == null) {
			mbMessageFlagPersistence = MBMessageFlagUtil.getPersistence();
		}

		if (mbStatsUserLocalService == null) {
			mbStatsUserLocalService = MBStatsUserLocalServiceFactory.getImpl();
		}

		if (mbStatsUserPersistence == null) {
			mbStatsUserPersistence = MBStatsUserUtil.getPersistence();
		}

		if (mbThreadLocalService == null) {
			mbThreadLocalService = MBThreadLocalServiceFactory.getImpl();
		}

		if (mbThreadPersistence == null) {
			mbThreadPersistence = MBThreadUtil.getPersistence();
		}
	}

	protected MBBanLocalService mbBanLocalService;
	protected MBBanService mbBanService;
	protected MBBanPersistence mbBanPersistence;
	protected MBCategoryLocalService mbCategoryLocalService;
	protected MBCategoryPersistence mbCategoryPersistence;
	protected MBDiscussionPersistence mbDiscussionPersistence;
	protected MBMessageLocalService mbMessageLocalService;
	protected MBMessageService mbMessageService;
	protected MBMessagePersistence mbMessagePersistence;
	protected MBMessageFlagLocalService mbMessageFlagLocalService;
	protected MBMessageFlagPersistence mbMessageFlagPersistence;
	protected MBStatsUserLocalService mbStatsUserLocalService;
	protected MBStatsUserPersistence mbStatsUserPersistence;
	protected MBThreadLocalService mbThreadLocalService;
	protected MBThreadPersistence mbThreadPersistence;
}