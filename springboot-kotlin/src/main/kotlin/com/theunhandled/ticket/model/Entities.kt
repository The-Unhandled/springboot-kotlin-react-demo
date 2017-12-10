package com.theunhandled.ticket.model

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.Id
import java.time.Instant
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

// TODO: Suggestions:
// 1: Auditorium Seat Formation
// 2: Movie Ratings
// 3: Cinema Ratings
// 4: Cinema actual location as a lat/long

@Document
data class User(@Id val username: String, val name: String, val tickets: List<Ticket>)
data class Ticket(val id: String, val theater: String, val auditorium: String, val movie: String, val date: Instant)

@Document
data class Cinema(@Id val name: String, val location: String, val auditoriums: List<Auditorium>)
data class Auditorium(val name: String, val seats: Int, val plays: List<Play>)
data class Play(val movie: String, val date: Instant, val emptySeats: Map<Int, Boolean>)

@Document
data class Movie(@Id val name: String, val tags: List<String>, val duration: Int)

interface UserRepository : MongoRepository<User, String>
interface CinemaRepository : MongoRepository<Cinema, String>
interface MovieRepository : MongoRepository<Movie, String>
