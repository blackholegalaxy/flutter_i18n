package eu.long1.flutter.i18n.arb

import com.intellij.json.JsonFileType
import FlutterI18nIcons
import javax.swing.Icon

object ArbFileType : JsonFileType() {

    override fun getIcon(): Icon = FlutterI18nIcons.ArbFile

    override fun getName(): String = "Application Resource Bundle"

    override fun getDefaultExtension(): String = "arb"

    override fun getDescription(): String = "Application Resource Bundle is a localization resource format that is simple, extensible, and directly usable."
}