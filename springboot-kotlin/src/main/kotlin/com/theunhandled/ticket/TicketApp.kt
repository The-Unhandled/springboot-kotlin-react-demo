package com.theunhandled.ticket

import com.theunhandled.ticket.model.Cinema
import com.theunhandled.ticket.model.Movie
import com.theunhandled.ticket.model.User
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
class TicketApp

fun main(args: Array<String>) {
    runApplication<TicketApp>(*args)
}
