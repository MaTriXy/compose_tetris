package github.leavesczy.compose_tetris.common.logic

/**
 * @Author: leavesCZY
 * @Date: 2022/1/17 23:34
 * @Desc:
 * @Github：https://github.com/leavesCZY
 */
interface SoundPlayer {

    fun play(soundType: SoundType)

    fun release()

}

enum class SoundType {
    Welcome,
    Transformation,
    Rotate,
    Fall,
    Clean,
}