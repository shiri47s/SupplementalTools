# 🗓️ Changelog

## 📦 Version 3.0.0

Minecraft **26.2** support, plus a large internal overhaul.

### ⚠️ Please read before updating

- **Requires Architectury API 21.0.7 or newer.**
- NeoForge users need **NeoForge 26.2.0.82 or newer**.
- **Accessory support moved to Trinkets Updated** (optional, Fabric and NeoForge).
  The old Trinkets and Curios integrations never worked and have been removed.
  Durable Totems now go in the **necklace** slot instead of a custom charm slot.

### 🐛 Fixed

- **Everything is visible and craftable again.** The previous release shipped with
  no models, recipes, loot tables, tags or world generation at all.
- **Tools and armour can be repaired.** The repair material tags were empty, so no
  piece could be repaired on an anvil.
- **Ores generate on NeoForge.** NeoForge had no world generation of its own.
- **A full Lead set now grants its bonus.** It reported itself as Amethyst, so the
  Heavy effect never applied and the tooltip named the wrong bonus.
- **Redstone armour shows your own signal strength.** The reading was shared
  between every player and never reached clients on a server.
- **Set bonus tooltips describe your own equipment**, not whoever else is online.
- The Anti-Lava smithing template no longer appears in *every* bastion treasure
  chest; it is now a 25% chance.
- Corrected the Anti-Lava and Haste/Luck effect icon colours.
- The used-totem advancement now reports the totem instead of your held item.
- Fixed missing entries in the durability-enchantable tag (bronze boots and the
  redstone tools).

### ✨ Changed

- **Lava moves like water while Anti-Lava is active** - full swimming, sprinting
  and drag, replacing an acceleration hack that compounded every tick.
- Attribute modifiers from the mod's effects are no longer written to save data.

### 🧹 Internal

- Migrated to Mojang mappings and rebuilt both data generators.
- World generation and loot changes now run through Architectury on both loaders,
  so Fabric and NeoForge ship an identical data set.
- Fixed a memory leak that kept player entities alive after logout.

---
💡 *As always, back up your worlds before updating. Happy crafting!*
