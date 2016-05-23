package com.brianpan.fireworks;

import com.davidleston.fireflower.Player;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FireworksController {

  @RequestMapping(value = "/hints", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
  public String getHints() {
    return "8";
  }

  @RequestMapping(value = "/bombs", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
  public String getBombs() {
    return "3";
  }

  @RequestMapping(value = "/game", method = RequestMethod.PUT)
  public int createGame() {
    new Player()

  }

}
