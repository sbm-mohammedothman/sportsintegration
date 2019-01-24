/*
 * Strava API v3
 * Strava API
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.quasas.sports.gen.client.api;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.quasas.sports.gen.client.model.DetailedClub;
import com.quasas.sports.gen.client.model.SummaryActivity;
import com.quasas.sports.gen.client.model.SummaryAthlete;
import com.quasas.sports.gen.client.model.SummaryClub;

/**
 * API tests for ClubsApi
 */
@Ignore
public class ClubsApiTest {

    private final ClubsApi api = new ClubsApi();

    
    /**
     * List Club Activities
     *
     * Retrieve recent activities from members of a specific club. The authenticated athlete must belong to the requested club in order to hit this endpoint. Pagination is supported. Athlete profile visibility is respected for all activities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClubActivitiesByIdTest() {
        Integer id = null;
        Integer page = null;
        Integer perPage = null;
        List<SummaryActivity> response = api.getClubActivitiesById(id, page, perPage);

        // TODO: test validations
    }
    
    /**
     * List Club Administrators.
     *
     * Returns a list of the administrators of a given club.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClubAdminsByIdTest() {
        Integer id = null;
        Integer page = null;
        Integer perPage = null;
        List<SummaryAthlete> response = api.getClubAdminsById(id, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Get Club
     *
     * Returns a given club using its identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClubByIdTest() {
        Integer id = null;
        DetailedClub response = api.getClubById(id);

        // TODO: test validations
    }
    
    /**
     * List Club Members
     *
     * Returns a list of the athletes who are members of a given club.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClubMembersByIdTest() {
        Integer id = null;
        Integer page = null;
        Integer perPage = null;
        List<SummaryAthlete> response = api.getClubMembersById(id, page, perPage);

        // TODO: test validations
    }
    
    /**
     * List Athlete Clubs
     *
     * Returns a list of the clubs whose membership includes the authenticated athlete.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoggedInAthleteClubsTest() {
        Integer page = null;
        Integer perPage = null;
        List<SummaryClub> response = api.getLoggedInAthleteClubs(page, perPage);

        // TODO: test validations
    }
    
}