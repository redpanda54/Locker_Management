package com.example.locker_management.domain.constant

enum class LockerStatus {
    AVAILABLE,
    RESERVED,
    MAINTENANCE
}

enum class ReservationStatus {
    REQUESTED,
    APPROVED,
    CANCELED,
    EXPIRED
}