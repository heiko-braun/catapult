package org.kontinuity.catapult.service.github.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.rules.ExternalResource;
import org.kontinuity.catapult.service.github.api.GitHubRepository;
import org.kontinuity.catapult.service.github.spi.GitHubServiceSpi;

/**
 * Utility class for {@link GitHubRepository}
 */
public class GitHubRepositoryRule extends ExternalResource {


    /**
     * Constructor
     *
     * @param gitHubService
     */
    public GitHubRepositoryRule(final GitHubServiceSpi gitHubService, final String repositoryNamePrefix) {
        this.gitHubService = gitHubService;
        this.repositoryNamePrefix = repositoryNamePrefix;
    }

    /**
     * the {@link GitHubServiceSpi} to use to submit the delete request.
     */
    private final GitHubServiceSpi gitHubService;

    private final String repositoryNamePrefix;

    private final List<String> repositoryNames = new ArrayList<>();


}
