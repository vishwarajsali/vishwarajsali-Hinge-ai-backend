package com.vish.hinge_ai_backend.conversations;

import javax.validation.constraints.NotNull;

public record CreateConversationRequest(

        @NotNull String profileId

) {
}
