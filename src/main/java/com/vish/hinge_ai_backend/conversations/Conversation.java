package com.vish.hinge_ai_backend.conversations;

import com.vish.hinge_ai_backend.profiles.Profile;

import java.util.List;

public record Conversation(
        String id,
        String profileId,
        List<ChatMessage> messages
) {
}
