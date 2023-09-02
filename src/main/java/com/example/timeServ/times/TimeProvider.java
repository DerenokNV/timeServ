package com.example.timeServ.times;

import com.example.timeServ.external.TimeServiceInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class TimeProvider implements CommandLineRunner {

  private final TimeServiceInterface timeServices;
  private final TimeProviderProperties providerProperties;

  @Value("${spring.application.name}")
  private String appName;

  @Value("${custom.welcomeMessage}")
  private String welcomeMessage;

  public TimeProvider( TimeServiceInterface timeService, TimeProviderProperties providerProperties ) {
    this.timeServices = timeService;
    this.providerProperties = providerProperties;
  }

  @Override
  public void run(String... args) throws Exception {
    Logger.getLogger( TimeProvider.class.getName() ).info( "running = " + appName + " :: with profile = " + providerProperties.getProfile() + " :: " + providerProperties.getDescription()  );
    Logger.getLogger( TimeProvider.class.getName() ).info( "running = " + welcomeMessage );
    this.timeServices.printCurrentTime();
  }
}
