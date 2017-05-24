package com.cd.bot.wrapper.http;

import com.cd.bot.api.controller.BotController;
import com.cd.bot.api.controller.OwnedTradeableCardController;
import com.cd.bot.model.domain.OwnedTradeableCard;
import com.cd.bot.model.domain.PlayerBot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Cory on 5/20/2017.
 */
public class OwnedTradeableCardService {

    private static final Logger log = LoggerFactory.getLogger(OwnedTradeableCardService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private String botApiUrl;

    public void addCards(List<OwnedTradeableCard> ownedTradeableCards, String accountName) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> requestEntity = new HttpEntity<>(ownedTradeableCards, headers);

        try {
            restTemplate.exchange(botApiUrl + OwnedTradeableCardController.ENDPOINT_ROOT + "/name/" + accountName, HttpMethod.POST, requestEntity, Void.class);
        } catch (RestClientException e) {
            log.error("Failed to add cards!");
            log.error(e.getMessage());
            throw new RuntimeException();
        }
    }

}