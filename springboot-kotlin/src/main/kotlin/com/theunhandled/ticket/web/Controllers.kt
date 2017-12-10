package com.theunhandled.ticket.web

import org.springframework.web.bind.annotation.RestController
import com.theunhandled.ticket.model.Ticket
import com.theunhandled.ticket.service.TicketService
import org.springframework.web.bind.annotation.GetMapping
import com.theunhandled.ticket.service.UserService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping("/")
class HealthController {

	@GetMapping
	fun health() = "Ticket App is alive"

}

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {
	
	@GetMapping
	fun findAll() = userService.findAll()
	
	@GetMapping("/{username}")
	fun findByUsername(@PathVariable username: String) = userService.findByUsername(username)
	
}
