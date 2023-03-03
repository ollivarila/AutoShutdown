package mocks;

import com.destroystokyo.paper.entity.ai.MobGoals;
import io.papermc.paper.datapack.DatapackManager;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import org.bukkit.*;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.data.BlockData;
import org.bukkit.boss.*;
import org.bukkit.command.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.SpawnCategory;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.*;
import org.bukkit.loot.LootTable;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.potion.PotionBrewer;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.Criteria;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.structure.StructureManager;
import org.bukkit.util.CachedServerIcon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class MockServer implements Server {


    private Collection<Player> players = new ArrayList<>();
    private boolean hasBeenCalled;

    public MockServer(boolean hasBeenCalled){
        this.hasBeenCalled = hasBeenCalled;
    }

    public void setPlayers(Collection<Player> players){
        this.players = players;
    }

    @Override
    public @NotNull File getPluginsFolder() {
        return null;
    }

    @Override
    public @NotNull String getName() {
        return null;
    }

    @Override
    public @NotNull String getVersion() {
        return null;
    }

    @Override
    public @NotNull String getBukkitVersion() {
        return null;
    }

    @Override
    public @NotNull String getMinecraftVersion() {
        return null;
    }

    @Override
    public @NotNull Collection<? extends Player> getOnlinePlayers() {
        hasBeenCalled = true;
        return this.players;
    }

    @Override
    public int getMaxPlayers() {
        return 0;
    }

    @Override
    public void setMaxPlayers(int i) {

    }

    @Override
    public int getPort() {
        return 0;
    }

    @Override
    public int getViewDistance() {
        return 0;
    }

    @Override
    public int getSimulationDistance() {
        return 0;
    }

    @Override
    public @NotNull String getIp() {
        return null;
    }

    @Override
    public @NotNull String getWorldType() {
        return null;
    }

    @Override
    public boolean getGenerateStructures() {
        return false;
    }

    @Override
    public int getMaxWorldSize() {
        return 0;
    }

    @Override
    public boolean getAllowEnd() {
        return false;
    }

    @Override
    public boolean getAllowNether() {
        return false;
    }

    @Override
    public @NotNull String getResourcePack() {
        return null;
    }

    @Override
    public @NotNull String getResourcePackHash() {
        return null;
    }

    @Override
    public @NotNull String getResourcePackPrompt() {
        return null;
    }

    @Override
    public boolean isResourcePackRequired() {
        return false;
    }

    @Override
    public boolean hasWhitelist() {
        return false;
    }

    @Override
    public void setWhitelist(boolean b) {

    }

    @Override
    public boolean isWhitelistEnforced() {
        return false;
    }

    @Override
    public void setWhitelistEnforced(boolean b) {

    }

    @Override
    public @NotNull Set<OfflinePlayer> getWhitelistedPlayers() {
        return null;
    }

    @Override
    public void reloadWhitelist() {

    }

    @Override
    public int broadcastMessage(@NotNull String s) {
        return 0;
    }

    @Override
    public @NotNull String getUpdateFolder() {
        return null;
    }

    @Override
    public @NotNull File getUpdateFolderFile() {
        return null;
    }

    @Override
    public long getConnectionThrottle() {
        return 0;
    }

    @Override
    public int getTicksPerAnimalSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerMonsterSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerWaterSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerWaterAmbientSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerWaterUndergroundCreatureSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerAmbientSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerSpawns(@NotNull SpawnCategory spawnCategory) {
        return 0;
    }

    @Override
    public @Nullable Player getPlayer(@NotNull String s) {
        return null;
    }

    @Override
    public @Nullable Player getPlayerExact(@NotNull String s) {
        return null;
    }

    @Override
    public @NotNull List<Player> matchPlayer(@NotNull String s) {
        return null;
    }

    @Override
    public @Nullable Player getPlayer(@NotNull UUID uuid) {
        return null;
    }

    @Override
    public @Nullable UUID getPlayerUniqueId(@NotNull String s) {
        return null;
    }

    @Override
    public @NotNull PluginManager getPluginManager() {
        return null;
    }

    @Override
    public @NotNull BukkitScheduler getScheduler() {
        return null;
    }

    @Override
    public @NotNull ServicesManager getServicesManager() {
        return null;
    }

    @Override
    public @NotNull List<World> getWorlds() {
        return null;
    }

    @Override
    public boolean isTickingWorlds() {
        return false;
    }

    @Override
    public @Nullable World createWorld(@NotNull WorldCreator worldCreator) {
        return null;
    }

    @Override
    public boolean unloadWorld(@NotNull String s, boolean b) {
        return false;
    }

    @Override
    public boolean unloadWorld(@NotNull World world, boolean b) {
        return false;
    }

    @Override
    public @Nullable World getWorld(@NotNull String s) {
        return null;
    }

    @Override
    public @Nullable World getWorld(@NotNull UUID uuid) {
        return null;
    }

    @Override
    public @Nullable World getWorld(@NotNull NamespacedKey namespacedKey) {
        return null;
    }

    @Override
    public @NotNull WorldBorder createWorldBorder() {
        return null;
    }

    @Override
    public @Nullable MapView getMap(int i) {
        return null;
    }

    @Override
    public @NotNull MapView createMap(@NotNull World world) {
        return null;
    }

    @Override
    public @NotNull ItemStack createExplorerMap(@NotNull World world, @NotNull Location location, @NotNull StructureType structureType) {
        return null;
    }

    @Override
    public @NotNull ItemStack createExplorerMap(@NotNull World world, @NotNull Location location, @NotNull StructureType structureType, int i, boolean b) {
        return null;
    }

    @Override
    public void reload() {

    }

    @Override
    public void reloadData() {

    }

    @Override
    public @NotNull Logger getLogger() {
        return null;
    }

    @Override
    public @Nullable PluginCommand getPluginCommand(@NotNull String s) {
        return null;
    }

    @Override
    public void savePlayers() {

    }

    @Override
    public boolean dispatchCommand(@NotNull CommandSender commandSender, @NotNull String s) throws CommandException {
        return false;
    }

    @Override
    public boolean addRecipe(@Nullable Recipe recipe) {
        return false;
    }

    @Override
    public @NotNull List<Recipe> getRecipesFor(@NotNull ItemStack itemStack) {
        return null;
    }

    @Override
    public @Nullable Recipe getRecipe(@NotNull NamespacedKey namespacedKey) {
        return null;
    }

    @Override
    public @Nullable Recipe getCraftingRecipe(@NotNull ItemStack[] itemStacks, @NotNull World world) {
        return null;
    }

    @Override
    public @NotNull ItemStack craftItem(@NotNull ItemStack[] itemStacks, @NotNull World world, @NotNull Player player) {
        return null;
    }

    @Override
    public @NotNull Iterator<Recipe> recipeIterator() {
        return null;
    }

    @Override
    public void clearRecipes() {

    }

    @Override
    public void resetRecipes() {

    }

    @Override
    public boolean removeRecipe(@NotNull NamespacedKey namespacedKey) {
        return false;
    }

    @Override
    public @NotNull Map<String, String[]> getCommandAliases() {
        return null;
    }

    @Override
    public int getSpawnRadius() {
        return 0;
    }

    @Override
    public void setSpawnRadius(int i) {

    }

    @Override
    public boolean shouldSendChatPreviews() {
        return false;
    }

    @Override
    public boolean isEnforcingSecureProfiles() {
        return false;
    }

    @Override
    public boolean getHideOnlinePlayers() {
        return false;
    }

    @Override
    public boolean getOnlineMode() {
        return false;
    }

    @Override
    public boolean getAllowFlight() {
        return false;
    }

    @Override
    public boolean isHardcore() {
        return false;
    }

    @Override
    public void shutdown() {

    }

    @Override
    public int broadcast(@NotNull String s, @NotNull String s1) {
        return 0;
    }

    @Override
    public int broadcast(@NotNull Component component) {
        return 0;
    }

    @Override
    public int broadcast(@NotNull Component component, @NotNull String s) {
        return 0;
    }

    @Override
    public @NotNull OfflinePlayer getOfflinePlayer(@NotNull String s) {
        return null;
    }

    @Override
    public @Nullable OfflinePlayer getOfflinePlayerIfCached(@NotNull String s) {
        return null;
    }

    @Override
    public @NotNull OfflinePlayer getOfflinePlayer(@NotNull UUID uuid) {
        return null;
    }

    @Override
    public @NotNull PlayerProfile createPlayerProfile(@Nullable UUID uuid, @Nullable String s) {
        return null;
    }

    @Override
    public @NotNull PlayerProfile createPlayerProfile(@NotNull UUID uuid) {
        return null;
    }

    @Override
    public @NotNull PlayerProfile createPlayerProfile(@NotNull String s) {
        return null;
    }

    @Override
    public @NotNull Set<String> getIPBans() {
        return null;
    }

    @Override
    public void banIP(@NotNull String s) {

    }

    @Override
    public void unbanIP(@NotNull String s) {

    }

    @Override
    public @NotNull Set<OfflinePlayer> getBannedPlayers() {
        return null;
    }

    @Override
    public @NotNull BanList getBanList(BanList.@NotNull Type type) {
        return null;
    }

    @Override
    public @NotNull Set<OfflinePlayer> getOperators() {
        return null;
    }

    @Override
    public @NotNull GameMode getDefaultGameMode() {
        return null;
    }

    @Override
    public void setDefaultGameMode(@NotNull GameMode gameMode) {

    }

    @Override
    public @NotNull ConsoleCommandSender getConsoleSender() {
        return null;
    }

    @Override
    public @NotNull CommandSender createCommandSender(@NotNull Consumer<? super Component> consumer) {
        return null;
    }

    @Override
    public @NotNull File getWorldContainer() {
        return null;
    }

    @Override
    public @NotNull OfflinePlayer[] getOfflinePlayers() {
        return new OfflinePlayer[0];
    }

    @Override
    public @NotNull Messenger getMessenger() {
        return null;
    }

    @Override
    public @NotNull HelpMap getHelpMap() {
        return null;
    }

    @Override
    public @NotNull Inventory createInventory(@Nullable InventoryHolder inventoryHolder, @NotNull InventoryType inventoryType) {
        return null;
    }

    @Override
    public @NotNull Inventory createInventory(@Nullable InventoryHolder inventoryHolder, @NotNull InventoryType inventoryType, @NotNull Component component) {
        return null;
    }

    @Override
    public @NotNull Inventory createInventory(@Nullable InventoryHolder inventoryHolder, @NotNull InventoryType inventoryType, @NotNull String s) {
        return null;
    }

    @Override
    public @NotNull Inventory createInventory(@Nullable InventoryHolder inventoryHolder, int i) throws IllegalArgumentException {
        return null;
    }

    @Override
    public @NotNull Inventory createInventory(@Nullable InventoryHolder inventoryHolder, int i, @NotNull Component component) throws IllegalArgumentException {
        return null;
    }

    @Override
    public @NotNull Inventory createInventory(@Nullable InventoryHolder inventoryHolder, int i, @NotNull String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public @NotNull Merchant createMerchant(@Nullable Component component) {
        return null;
    }

    @Override
    public @NotNull Merchant createMerchant(@Nullable String s) {
        return null;
    }

    @Override
    public int getMaxChainedNeighborUpdates() {
        return 0;
    }

    @Override
    public int getMonsterSpawnLimit() {
        return 0;
    }

    @Override
    public int getAnimalSpawnLimit() {
        return 0;
    }

    @Override
    public int getWaterAnimalSpawnLimit() {
        return 0;
    }

    @Override
    public int getWaterAmbientSpawnLimit() {
        return 0;
    }

    @Override
    public int getWaterUndergroundCreatureSpawnLimit() {
        return 0;
    }

    @Override
    public int getAmbientSpawnLimit() {
        return 0;
    }

    @Override
    public int getSpawnLimit(@NotNull SpawnCategory spawnCategory) {
        return 0;
    }

    @Override
    public boolean isPrimaryThread() {
        return false;
    }

    @Override
    public @NotNull Component motd() {
        return null;
    }

    @Override
    public @NotNull String getMotd() {
        return null;
    }

    @Override
    public @Nullable Component shutdownMessage() {
        return null;
    }

    @Override
    public @Nullable String getShutdownMessage() {
        return null;
    }

    @Override
    public Warning.@NotNull WarningState getWarningState() {
        return null;
    }

    @Override
    public @NotNull ItemFactory getItemFactory() {
        return null;
    }

    @Override
    public @NotNull ScoreboardManager getScoreboardManager() {
        return null;
    }

    @Override
    public @NotNull Criteria getScoreboardCriteria(@NotNull String s) {
        return null;
    }

    @Override
    public @Nullable CachedServerIcon getServerIcon() {
        return null;
    }

    @Override
    public @NotNull CachedServerIcon loadServerIcon(@NotNull File file) throws IllegalArgumentException, Exception {
        return null;
    }

    @Override
    public @NotNull CachedServerIcon loadServerIcon(@NotNull BufferedImage bufferedImage) throws IllegalArgumentException, Exception {
        return null;
    }

    @Override
    public void setIdleTimeout(int i) {

    }

    @Override
    public int getIdleTimeout() {
        return 0;
    }

    @Override
    public ChunkGenerator.@NotNull ChunkData createChunkData(@NotNull World world) {
        return null;
    }

    @Override
    public ChunkGenerator.@NotNull ChunkData createVanillaChunkData(@NotNull World world, int i, int i1) {
        return null;
    }

    @Override
    public @NotNull BossBar createBossBar(@Nullable String s, @NotNull BarColor barColor, @NotNull BarStyle barStyle, @NotNull BarFlag... barFlags) {
        return null;
    }

    @Override
    public @NotNull KeyedBossBar createBossBar(@NotNull NamespacedKey namespacedKey, @Nullable String s, @NotNull BarColor barColor, @NotNull BarStyle barStyle, @NotNull BarFlag... barFlags) {
        return null;
    }

    @Override
    public @NotNull Iterator<KeyedBossBar> getBossBars() {
        return null;
    }

    @Override
    public @Nullable KeyedBossBar getBossBar(@NotNull NamespacedKey namespacedKey) {
        return null;
    }

    @Override
    public boolean removeBossBar(@NotNull NamespacedKey namespacedKey) {
        return false;
    }

    @Override
    public @Nullable Entity getEntity(@NotNull UUID uuid) {
        return null;
    }

    @Override
    public @NotNull double[] getTPS() {
        return new double[0];
    }

    @Override
    public @NotNull long[] getTickTimes() {
        return new long[0];
    }

    @Override
    public double getAverageTickTime() {
        return 0;
    }

    @Override
    public @NotNull CommandMap getCommandMap() {
        return null;
    }

    @Override
    public @Nullable Advancement getAdvancement(@NotNull NamespacedKey namespacedKey) {
        return null;
    }

    @Override
    public @NotNull Iterator<Advancement> advancementIterator() {
        return null;
    }

    @Override
    public @NotNull BlockData createBlockData(@NotNull Material material) {
        return null;
    }

    @Override
    public @NotNull BlockData createBlockData(@NotNull Material material, @Nullable Consumer<BlockData> consumer) {
        return null;
    }

    @Override
    public @NotNull BlockData createBlockData(@NotNull String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public @NotNull BlockData createBlockData(@Nullable Material material, @Nullable String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public @Nullable <T extends Keyed> Tag<T> getTag(@NotNull String s, @NotNull NamespacedKey namespacedKey, @NotNull Class<T> aClass) {
        return null;
    }

    @Override
    public @NotNull <T extends Keyed> Iterable<Tag<T>> getTags(@NotNull String s, @NotNull Class<T> aClass) {
        return null;
    }

    @Override
    public @Nullable LootTable getLootTable(@NotNull NamespacedKey namespacedKey) {
        return null;
    }

    @Override
    public @NotNull List<Entity> selectEntities(@NotNull CommandSender commandSender, @NotNull String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public @NotNull StructureManager getStructureManager() {
        return null;
    }

    @Override
    public @Nullable <T extends Keyed> Registry<T> getRegistry(@NotNull Class<T> aClass) {
        return null;
    }

    @Override
    public @NotNull UnsafeValues getUnsafe() {
        return null;
    }

    @Override
    public @NotNull Spigot spigot() {
        return null;
    }

    @Override
    public void reloadPermissions() {

    }

    @Override
    public boolean reloadCommandAliases() {
        return false;
    }

    @Override
    public boolean suggestPlayerNamesWhenNullTabCompletions() {
        return false;
    }

    @Override
    public @NotNull String getPermissionMessage() {
        return null;
    }

    @Override
    public @NotNull Component permissionMessage() {
        return null;
    }

    @Override
    public com.destroystokyo.paper.profile.@NotNull PlayerProfile createProfile(@NotNull UUID uuid) {
        return null;
    }

    @Override
    public com.destroystokyo.paper.profile.@NotNull PlayerProfile createProfile(@NotNull String s) {
        return null;
    }

    @Override
    public com.destroystokyo.paper.profile.@NotNull PlayerProfile createProfile(@Nullable UUID uuid, @Nullable String s) {
        return null;
    }

    @Override
    public com.destroystokyo.paper.profile.@NotNull PlayerProfile createProfileExact(@Nullable UUID uuid, @Nullable String s) {
        return null;
    }

    @Override
    public int getCurrentTick() {
        return 0;
    }

    @Override
    public boolean isStopping() {
        return false;
    }

    @Override
    public @NotNull MobGoals getMobGoals() {
        return null;
    }

    @Override
    public @NotNull DatapackManager getDatapackManager() {
        return null;
    }

    @Override
    public @NotNull PotionBrewer getPotionBrewer() {
        return null;
    }

    @Override
    public @NotNull Iterable<? extends Audience> audiences() {
        return null;
    }

    @Override
    public void sendPluginMessage(@NotNull Plugin plugin, @NotNull String s, @NotNull byte[] bytes) {

    }

    @Override
    public @NotNull Set<String> getListeningPluginChannels() {
        return null;
    }
}
