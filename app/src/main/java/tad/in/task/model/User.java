package tad.in.task.model;

import com.google.gson.annotations.SerializedName;

public class User {



    @SerializedName("id")
    private Integer id;
    @SerializedName("node_id")
    private String nodeId;
    @SerializedName("name")
    private String name;
    @SerializedName("full_name")
    private String fullName;
    @SerializedName("private")
    private Boolean _private;
    @SerializedName("owner")
    private Owner owner;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("description")
    private String description;
    @SerializedName("fork")
    private Boolean fork;
    @SerializedName("url")
    private String url;
    @SerializedName("forks_url")
    private String forksUrl;
    @SerializedName("keys_url")
    private String keysUrl;
    @SerializedName("collaborators_url")
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    private String teamsUrl;
    @SerializedName("hooks_url")
    private String hooksUrl;
    @SerializedName("issue_events_url")
    private String issueEventsUrl;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("assignees_url")
    private String assigneesUrl;
    @SerializedName("branches_url")
    private String branchesUrl;
    @SerializedName("tags_url")
    private String tagsUrl;
    @SerializedName("blobs_url")
    private String blobsUrl;
    @SerializedName("git_tags_url")
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    private String gitRefsUrl;
    @SerializedName("trees_url")
    private String treesUrl;
    @SerializedName("statuses_url")
    private String statusesUrl;
    @SerializedName("languages_url")
    private String languagesUrl;
    @SerializedName("stargazers_url")
    private String stargazersUrl;
    @SerializedName("contributors_url")
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    private String subscribersUrl;
    @SerializedName("subscription_url")
    private String subscriptionUrl;
    @SerializedName("commits_url")
    private String commitsUrl;
    @SerializedName("git_commits_url")
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    private String issueCommentUrl;
    @SerializedName("contents_url")
    private String contentsUrl;
    @SerializedName("compare_url")
    private String compareUrl;
    @SerializedName("merges_url")
    private String mergesUrl;
    @SerializedName("archive_url")
    private String archiveUrl;
    @SerializedName("downloads_url")
    private String downloadsUrl;
    @SerializedName("issues_url")
    private String issuesUrl;
    @SerializedName("pulls_url")
    private String pullsUrl;
    @SerializedName("milestones_url")
    private String milestonesUrl;
    @SerializedName("notifications_url")
    private String notificationsUrl;
    @SerializedName("labels_url")
    private String labelsUrl;
    @SerializedName("releases_url")
    private String releasesUrl;
    @SerializedName("deployments_url")
    private String deploymentsUrl;


    @SerializedName("id")
    public Integer getId() {
        return id;
    }

    @SerializedName("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @SerializedName("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @SerializedName("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("name")
    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("full_name")
    public String getFullName() {
        return fullName;
    }

    @SerializedName("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @SerializedName("private")
    public Boolean getPrivate() {
        return _private;
    }

    @SerializedName("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @SerializedName("owner")
    public Owner getOwner() {
        return owner;
    }

    @SerializedName("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @SerializedName("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @SerializedName("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @SerializedName("description")
    public String getDescription() {
        return description;
    }

    @SerializedName("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @SerializedName("fork")
    public Boolean getFork() {
        return fork;
    }

    @SerializedName("fork")
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    @SerializedName("url")
    public String getUrl() {
        return url;
    }

    @SerializedName("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @SerializedName("forks_url")
    public String getForksUrl() {
        return forksUrl;
    }

    @SerializedName("forks_url")
    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    @SerializedName("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    @SerializedName("keys_url")
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    @SerializedName("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    @SerializedName("collaborators_url")
    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    @SerializedName("teams_url")
    public String getTeamsUrl() {
        return teamsUrl;
    }

    @SerializedName("teams_url")
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    @SerializedName("hooks_url")
    public String getHooksUrl() {
        return hooksUrl;
    }

    @SerializedName("hooks_url")
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    @SerializedName("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    @SerializedName("issue_events_url")
    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    @SerializedName("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @SerializedName("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @SerializedName("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    @SerializedName("assignees_url")
    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    @SerializedName("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    @SerializedName("branches_url")
    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    @SerializedName("tags_url")
    public String getTagsUrl() {
        return tagsUrl;
    }

    @SerializedName("tags_url")
    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    @SerializedName("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    @SerializedName("blobs_url")
    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    @SerializedName("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    @SerializedName("git_tags_url")
    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    @SerializedName("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    @SerializedName("git_refs_url")
    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    @SerializedName("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    @SerializedName("trees_url")
    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    @SerializedName("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    @SerializedName("statuses_url")
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    @SerializedName("languages_url")
    public String getLanguagesUrl() {
        return languagesUrl;
    }

    @SerializedName("languages_url")
    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    @SerializedName("stargazers_url")
    public String getStargazersUrl() {
        return stargazersUrl;
    }

    @SerializedName("stargazers_url")
    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    @SerializedName("contributors_url")
    public String getContributorsUrl() {
        return contributorsUrl;
    }

    @SerializedName("contributors_url")
    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    @SerializedName("subscribers_url")
    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    @SerializedName("subscribers_url")
    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    @SerializedName("subscription_url")
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    @SerializedName("subscription_url")
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    @SerializedName("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    @SerializedName("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    @SerializedName("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    @SerializedName("git_commits_url")
    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    @SerializedName("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    @SerializedName("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @SerializedName("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    @SerializedName("issue_comment_url")
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    @SerializedName("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    @SerializedName("contents_url")
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    @SerializedName("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    @SerializedName("compare_url")
    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    @SerializedName("merges_url")
    public String getMergesUrl() {
        return mergesUrl;
    }

    @SerializedName("merges_url")
    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    @SerializedName("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    @SerializedName("archive_url")
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    @SerializedName("downloads_url")
    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    @SerializedName("downloads_url")
    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    @SerializedName("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    @SerializedName("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    @SerializedName("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    @SerializedName("pulls_url")
    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    @SerializedName("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    @SerializedName("milestones_url")
    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    @SerializedName("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    @SerializedName("notifications_url")
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    @SerializedName("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    @SerializedName("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    @SerializedName("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    @SerializedName("releases_url")
    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    @SerializedName("deployments_url")
    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    @SerializedName("deployments_url")
    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }


}
