/* Generated File */
package models.doobie.settings

import models.settings.SettingKey
import services.database.doobie.DoobieQueryService.Imports._

object SettingKeyDoobie {
  implicit val settingKeyMeta: Meta[SettingKey] = pgEnumStringOpt("SettingKey", SettingKey.withValueOpt, _.value)
}
