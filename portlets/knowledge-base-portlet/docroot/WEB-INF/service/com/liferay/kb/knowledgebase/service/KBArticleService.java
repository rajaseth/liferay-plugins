/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
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

package com.liferay.kb.knowledgebase.service;

/**
 * <a href="KBArticleService.java.html"><b><i>View Source</i></b></a>
 *
 * @author Jorge Ferrer
 *
 */
public interface KBArticleService {
	public com.liferay.kb.knowledgebase.model.KBArticle addArticle(long plid,
		java.lang.String title, java.lang.String content,
		java.lang.String description, boolean minorEdit, boolean template,
		boolean draft, long parentResourcePrimKey,
		java.lang.String[] tagsEntries, javax.portlet.PortletPreferences prefs,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public void addArticleAttachments(long resourcePrimKey,
		java.util.List<com.liferay.portal.kernel.util.ObjectValuePair<String, byte[]>> files)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public void deleteArticle(long plid, long resourcePrimKey)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public void deleteArticleAttachment(long resourcePrimKey,
		java.lang.String fileName)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public com.liferay.kb.knowledgebase.model.KBArticle getArticle(
		long resourcePrimKey)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public com.liferay.kb.knowledgebase.model.KBArticle getArticle(
		long resourcePrimKey, double version)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public com.liferay.kb.knowledgebase.model.KBArticle getArticle(
		long resourcePrimKey, double version, long plid)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public com.liferay.kb.knowledgebase.model.KBArticle getArticle(
		long groupId, java.lang.String title)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public com.liferay.kb.knowledgebase.model.KBArticle getArticle(
		long groupId, java.lang.String title, double version)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public com.liferay.kb.knowledgebase.model.KBArticle getArticle(
		long groupId, java.lang.String title, double version, long plid)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public java.util.List<com.liferay.kb.knowledgebase.model.KBArticle> getArticles(
		long resourcePrimKey, int start, int end)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public java.lang.String getArticlesRSS(long resourcePrimKey, int max,
		java.lang.String type, double version, java.lang.String displayStyle,
		int abstractLength, java.lang.String feedURL)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public java.util.List<com.liferay.kb.knowledgebase.model.KBArticle> getCompanyArticles(
		long companyId, int max)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public java.lang.String getCompanyArticlesRSS(long companyId, int max,
		java.lang.String type, double version, java.lang.String displayStyle,
		int abstractLength, java.lang.String description,
		java.lang.String feedURL,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public java.util.List<com.liferay.kb.knowledgebase.model.KBArticle> getGroupArticlesIncludingUserDrafts(
		long groupId, boolean template, long userId, int start, int end)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public java.util.List<com.liferay.kb.knowledgebase.model.KBArticle> getGroupArticlesIncludingUserDrafts(
		long groupId, boolean template, long userId, int max)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public java.lang.String getGroupArticlesIncludingUserDraftsRSS(
		long groupId, int max, java.lang.String type, double version,
		java.lang.String displayStyle, int abstractLength,
		java.lang.String description, java.lang.String feedURL,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public java.util.List<com.liferay.kb.knowledgebase.model.KBArticle> getGroupsArticles(
		long[] groupIds, int max)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public java.lang.String getGroupsArticlesRSS(long[] groupIds, int max,
		java.lang.String type, double version, java.lang.String displayStyle,
		int abstractLength, java.lang.String description,
		java.lang.String feedURL,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public java.util.List<com.liferay.kb.knowledgebase.model.KBArticle> getSubscribedArticles(
		long userId, long groupId, int start, int end)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public void importDocbook(long groupId, java.io.File file,
		javax.portlet.PortletPreferences prefs,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws java.lang.Exception;

	public com.liferay.kb.knowledgebase.model.KBArticle revertArticle(
		long resourcePrimKey, double version,
		javax.portlet.PortletPreferences prefs,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public void subscribe(long plid)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public void subscribeArticle(long resourcePrimKey)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public void unsubscribe(long plid)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public void unsubscribeArticle(long resourcePrimKey)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public com.liferay.kb.knowledgebase.model.KBArticle updateArticle(
		long plid, long resourcePrimKey, double version,
		java.lang.String title, java.lang.String content,
		java.lang.String description, boolean minorEdit, boolean template,
		boolean draft, long parentResourcePrimKey,
		java.lang.String[] tagsEntries, javax.portlet.PortletPreferences prefs,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;
}