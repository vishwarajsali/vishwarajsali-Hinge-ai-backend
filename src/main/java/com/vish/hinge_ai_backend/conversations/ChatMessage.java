package com.vish.hinge_ai_backend.conversations;

import java.time.LocalDateTime;

public record ChatMessage (
        String messageText,
        String autherId,
        LocalDateTime messageTime

) {
}
