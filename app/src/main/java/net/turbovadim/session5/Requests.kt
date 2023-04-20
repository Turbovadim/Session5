package net.turbovadim.session5

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

val json = """
[
  {
    "type": "chats",
    "body": [
      {
        "id": 1,
        "first": {
          "id": 1,
          "firstname": "Имя",
          "lastname": "Фамилия",
          "patronymic": "Отчество",
          "avatar": "avatar1.jpg"
        },
        "second": {
          "id": 1,
          "firstname": "Имя",
          "lastname": "Фамилия",
          "patronymic": "Отчество",
          "avatar": "avatar1.jpg"
        }
      },
      {
        "id": 2,
        "first": {
          "id": 2,
          "firstname": "Имя",
          "lastname": "Фамилия",
          "patronymic": "Отчество",
          "avatar": "avatar1.jpg"
        },
        "second": {
          "id": 2,
          "firstname": "Имя",
          "lastname": "Фамилия",
          "patronymic": "Отчество",
          "avatar": "avatar1.jpg"
        }
      }
    ]
  }
]
""".trimIndent()

@Serializable
data class Chat(
    val id: Int,
    val first: ChatAttributes,
    val second: ChatAttributes
)

@Serializable
data class ChatAttributes(
    val id: Int,
    val firstname: String,
    val lastname: String,
    val patronymic: String,
    val avatar: String
)

fun getChats(): List<Chat> {
    return Json.decodeFromString(json)
}