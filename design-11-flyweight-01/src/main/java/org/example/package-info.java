/**
 * @description:享元模式
 * 享元模式，主要在于共享通⽤对象，减少内存的使⽤，提升系统的访问效率。
 * ⽽这部分共享对象通常⽐ 较耗费内存或者需要查询⼤量接⼝或者使⽤数据库资源，
 * 因此统⼀抽离作为共享对象使⽤。
 *
 * 最终交给活动控制类来处理查询操作，并提供活动的所有信息和库存。
 * 因为库存是变化的，所以我 们模拟的 RedisUtils 中设置了定时任务使⽤库存。
 * @author：wwei
 * @date: 2022/12/27
 */
package org.example;