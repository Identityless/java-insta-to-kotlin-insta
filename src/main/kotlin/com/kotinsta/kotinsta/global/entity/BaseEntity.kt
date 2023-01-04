package com.kotinsta.kotinsta.global.entity

import lombok.AccessLevel
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@Getter
@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener::class)
@ToString
class BaseEntity() {
    @CreatedDate
    private lateinit var createdAt : LocalDateTime

    @LastModifiedDate
    private lateinit var updatedAt : LocalDateTime

    private var isDelete : Boolean = false

    fun deleteEntity() : Unit{
        this.isDelete = true
    }
}