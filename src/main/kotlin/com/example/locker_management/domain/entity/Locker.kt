package com.example.locker_management.domain.entity

import com.example.locker_management.domain.constant.LockerStatus
import jakarta.persistence.*

@Entity
@Table(name = "lockers")
data class Locker(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "locker_id")
    val id: Long = 0L,

    @Column(name = "locker_number", nullable = false, unique = true)
    val lockerNumber: String,

    @Column
    val location: String? = null,

    @Column(name = "locker_status", nullable = false)
    @Enumerated(EnumType.STRING)
    val status: LockerStatus = LockerStatus.AVAILABLE,

    @OneToMany(mappedBy = "locker", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val reservations: List<Reservation> = mutableListOf()
)