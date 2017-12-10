package com.theunhandled.ticket.service

import com.theunhandled.ticket.model.User
import org.springframework.stereotype.Service
import com.theunhandled.ticket.model.UserRepository
import java.lang.RuntimeException

@Service
class UserService(private val userRepository: UserRepository) {

	fun findAll() = userRepository.findAll()
	fun findByUsername(username: String) = userRepository.findById(username).orElseThrow { RuntimeException("No User Found") }
		
}
