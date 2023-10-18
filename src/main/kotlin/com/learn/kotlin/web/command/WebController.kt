package com.learn.kotlin.web.command

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebController {

    @GetMapping("/index")
    fun getIndex(): ResponseEntity<String> {
        return ResponseEntity.ok("Welcome to my site")
    }
}
