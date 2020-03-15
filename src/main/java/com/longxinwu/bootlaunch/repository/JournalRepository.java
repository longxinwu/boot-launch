package com.longxinwu.bootlaunch.repository;

import com.longxinwu.bootlaunch.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 为数据创建一个持久化机制，那么我们就需要使用Spring Data JPA技术.
 * 上面的代码片所展示的是Spring Data Repository JPA技术，要使用这项技术只需要继承JpaRepository接口即可。
 * JpaRepository是一个标记接口，允许Spring Data Repository引擎识别它并提供必要的代理类来实现基本的CRUD
 * (Create, Read, Update, Delete) 和一些自定义的方法。
 * 你可以通过一些类似于findByTitleLike、findBySummary、findByTitleAndSummaryIgnoringCase等等命名约定去实现你的方法。
 * 默认情况下，这些方法所实现的功能都会被设置成一个事务。JpaRepository也有一些非常便捷的操作可以对数据进行排序和分页的操作。
 */
public interface JournalRepository extends JpaRepository<Journal, Long> {
}
