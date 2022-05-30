package junkiyun.kotlinstudy.singleton

import org.slf4j.LoggerFactory

object AuditLogService {
    private const val AUDIT_LOGGER_NAME = "audit-log"
    private val logger = LoggerFactory.getLogger(AUDIT_LOGGER_NAME)
    fun info(message: String, vararg params: Any) {
        logger.info(message, params)
    }
    fun warn(message: String, vararg params: Any) {
        logger.warn(message, params)
    }
}