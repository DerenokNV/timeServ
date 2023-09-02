package com.example.timeServ.external;

import com.example.timeServ.times.TimeProviderProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@Service
//@ConditionalOnProperty(value = "spring.profiles.active", havingValue = "prod", matchIfMissing = true)
public class TimeService implements TimeServiceInterface {
  private final TimeProviderProperties providerProperties;

  @Autowired
  public TimeService( TimeProviderProperties providerProperties ) {
    this.providerProperties = providerProperties;
  }

  @Override
  public void printCurrentTime() {
    SimpleDateFormat dateFormat = new SimpleDateFormat( providerProperties.getFormat() );
    Logger.getLogger( TimeService.class.getName() ).info( providerProperties.getDescription() );
    Logger.getLogger( TimeService.class.getName() ).info( "current time = " + dateFormat.format( new Date() ) );
  }
}
