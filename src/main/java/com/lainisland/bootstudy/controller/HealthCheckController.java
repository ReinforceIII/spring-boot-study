package com.lainisland.bootstudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ReinforceIII (reinforce3733@gmail.com)
 */

@Slf4j
@RestController
@RequestMapping("/test")
public class HealthCheckController {

  @GetMapping
  public String checkServer() {
    log.info("Server Check API: OK!");
    return "OK!";
  }
}
