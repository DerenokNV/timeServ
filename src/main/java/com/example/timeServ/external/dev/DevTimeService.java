package com.example.timeServ.external.dev;

import com.example.timeServ.external.TimeServiceInterface;
import com.example.timeServ.times.TimeProviderProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
//@Profile("prod")
//@ConditionalOnProperty(value="spring.profiles.active", havingValue = "dev")
public class DevTimeService implements TimeServiceInterface {

  @Override
  public void printCurrentTime() {
    Logger.getLogger( DevTimeService.class.getName() ).info( "UUNDER CONSTRUCTION" );
  }
}
