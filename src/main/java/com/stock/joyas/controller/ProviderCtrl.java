package com.stock.joyas.controller;

import com.stock.joyas.dto.ProviderDTO;
import com.stock.joyas.service.ProviderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/providers")
@Tag(name = "Provider", description = "The provider API")
public class ProviderCtrl {

    private final ProviderService providerService;

    @Operation(summary = "Get all providers", description = "Get all providers", tags = "Provider", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ProviderDTO.class)))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Bad GATEWAY", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @GetMapping
    public ResponseEntity<List<ProviderDTO>> getAllProviders(){
        log.traceEntry("enter to get all providers controller method");
        return log.traceExit(ResponseEntity.ok().body(providerService.getAllProviders()));
    }
}
