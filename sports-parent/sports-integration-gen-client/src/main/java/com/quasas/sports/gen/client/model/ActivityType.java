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


package com.quasas.sports.gen.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * An enumeration of the types an activity may have.
 */
public enum ActivityType {
  
  ALPINESKI("AlpineSki"),
  
  BACKCOUNTRYSKI("BackcountrySki"),
  
  CANOEING("Canoeing"),
  
  CROSSFIT("Crossfit"),
  
  EBIKERIDE("EBikeRide"),
  
  ELLIPTICAL("Elliptical"),
  
  GOLF("Golf"),
  
  HANDCYCLE("Handcycle"),
  
  HIKE("Hike"),
  
  ICESKATE("IceSkate"),
  
  INLINESKATE("InlineSkate"),
  
  KAYAKING("Kayaking"),
  
  KITESURF("Kitesurf"),
  
  NORDICSKI("NordicSki"),
  
  RIDE("Ride"),
  
  ROCKCLIMBING("RockClimbing"),
  
  ROLLERSKI("RollerSki"),
  
  ROWING("Rowing"),
  
  RUN("Run"),
  
  SAIL("Sail"),
  
  SKATEBOARD("Skateboard"),
  
  SNOWBOARD("Snowboard"),
  
  SNOWSHOE("Snowshoe"),
  
  SOCCER("Soccer"),
  
  STAIRSTEPPER("StairStepper"),
  
  STANDUPPADDLING("StandUpPaddling"),
  
  SURFING("Surfing"),
  
  SWIM("Swim"),
  
  VELOMOBILE("Velomobile"),
  
  VIRTUALRIDE("VirtualRide"),
  
  VIRTUALRUN("VirtualRun"),
  
  WALK("Walk"),
  
  WEIGHTTRAINING("WeightTraining"),
  
  WHEELCHAIR("Wheelchair"),
  
  WINDSURF("Windsurf"),
  
  WORKOUT("Workout"),
  
  YOGA("Yoga");

  private String value;

  ActivityType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ActivityType fromValue(String text) {
    for (ActivityType b : ActivityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

