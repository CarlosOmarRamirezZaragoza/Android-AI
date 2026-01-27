package com.ml.dogedex.core.api.dto

import com.ml.dogedex.core.model.User

class UserDTOMapper {
    fun fromUserDTOToUserDomain(userDTO: UserDTO) =
        User(userDTO.id, userDTO.email, userDTO.authenticationToken)
}