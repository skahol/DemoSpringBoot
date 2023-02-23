package com.example.demo.controller.internal;

import com.example.demo.dto.ServiceResponseDTO;
import com.example.demo.exception.ServiceException;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DemoController {

    @Value("${application.name")
    private String name;

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @CrossOrigin
    public void corsHeaders(HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with");
        response.addHeader("Access-Control-Max-Age", "3600");
    }

//    @ApiOperation(value = "health end point and a sample for success response")
    @GetMapping(value = "/health")
    public ServiceResponseDTO health() throws ServiceException {
        LOGGER.info("Request received for health check");
        return new ServiceResponseDTO.Builder()
                .setHttpStatus(HttpStatus.OK.value())
                .setSuccess(true)
                .setPayload(null)
                .build();
    }

}
