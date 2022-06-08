package org.jetbrains.exposed.sql.vendors

import java.util.*

internal object SpannerDataTypeProvider : DataTypeProvider() {
    override fun booleanType(): String = "BOOL"
    override fun longType(): String = "INT64"
    override fun ulongType(): String = "INT64"
    override fun longAutoincType(): String = "BIGSERIAL"
    override fun binaryType(): String = "BYTES"
    override fun doubleType(): String = "FLOAT64"
    override fun floatType(): String = "FLOAT64"
    override fun integerType(): String = "INT64"
    override fun integerAutoincType(): String = "INT64"
    override fun uintegerType(): String = "INT64"
    override fun byteType(): String = "INT64"
    override fun ubyteType(): String = "INT64"
    override fun dateTimeType(): String = "TIMESTAMP"
    override fun textType(): String = "STRING"
    override fun blobType(): String = "BYTES"

    override fun uuidType(): String = "STRING"
    override fun uuidToDB(value: UUID): Any = value
}

internal object SpannerFunctionProvider : FunctionProvider()

/**
 * Spanner dialect implementation.
 */
open class SpannerDialect : VendorDialect("spanner", SpannerDataTypeProvider, SpannerFunctionProvider) {
    companion object {
        /** Spanner dialect name */
        const val dialectName: String = "spanner"
    }
}
