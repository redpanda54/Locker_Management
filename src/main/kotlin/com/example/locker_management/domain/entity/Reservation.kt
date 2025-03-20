package com.example.locker_management.domain.entity

import com.example.locker_management.domain.constant.ReservationStatus
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "reservations")
data class Reservation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    val id: Long = 0L,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "locker_id", nullable = false)
    val locker: Locker,

    @Column(name = "reserved_at", nullable = false)
    val reservedAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "expired_at")
    val expiredAt: LocalDateTime? = null,

    @Column(name = "reservation_status", nullable = false)
    @Enumerated(EnumType.STRING)
    val status: ReservationStatus = ReservationStatus.REQUESTED
)