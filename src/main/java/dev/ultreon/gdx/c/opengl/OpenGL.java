package dev.ultreon.gdx.c.opengl;

import com.badlogic.gdx.graphics.GL32;
import org.teavm.interop.Address;
import org.teavm.interop.Import;

public class OpenGL {
    public static final int GL_VERSION_1_0 = 1;
    public static final int GL_DEPTH_BUFFER_BIT = 0x00000100;
    public static final int GL_STENCIL_BUFFER_BIT = 0x00000400;
    public static final int GL_COLOR_BUFFER_BIT = 0x00004000;
    public static final int GL_FALSE = 0;
    public static final int GL_TRUE = 1;
    public static final int GL_POINTS = 0x0000;
    public static final int GL_LINES = 0x0001;
    public static final int GL_LINE_LOOP = 0x0002;
    public static final int GL_LINE_STRIP = 0x0003;
    public static final int GL_TRIANGLES = 0x0004;
    public static final int GL_TRIANGLE_STRIP = 0x0005;
    public static final int GL_TRIANGLE_FAN = 0x0006;
    public static final int GL_QUADS = 0x0007;
    public static final int GL_NEVER = 0x0200;
    public static final int GL_LESS = 0x0201;
    public static final int GL_EQUAL = 0x0202;
    public static final int GL_LEQUAL = 0x0203;
    public static final int GL_GREATER = 0x0204;
    public static final int GL_NOTEQUAL = 0x0205;
    public static final int GL_GEQUAL = 0x0206;
    public static final int GL_ALWAYS = 0x0207;
    public static final int GL_ZERO = 0;
    public static final int GL_ONE = 1;
    public static final int GL_SRC_COLOR = 0x0300;
    public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;
    public static final int GL_SRC_ALPHA = 0x0302;
    public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;
    public static final int GL_DST_ALPHA = 0x0304;
    public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;
    public static final int GL_DST_COLOR = 0x0306;
    public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;
    public static final int GL_SRC_ALPHA_SATURATE = 0x0308;
    public static final int GL_NONE = 0;
    public static final int GL_FRONT_LEFT = 0x0400;
    public static final int GL_FRONT_RIGHT = 0x0401;
    public static final int GL_BACK_LEFT = 0x0402;
    public static final int GL_BACK_RIGHT = 0x0403;
    public static final int GL_FRONT = 0x0404;
    public static final int GL_BACK = 0x0405;
    public static final int GL_LEFT = 0x0406;
    public static final int GL_RIGHT = 0x0407;
    public static final int GL_FRONT_AND_BACK = 0x0408;
    public static final int GL_NO_ERROR = 0;
    public static final int GL_INVALID_ENUM = 0x0500;
    public static final int GL_INVALID_VALUE = 0x0501;
    public static final int GL_INVALID_OPERATION = 0x0502;
    public static final int GL_OUT_OF_MEMORY = 0x0505;
    public static final int GL_CW = 0x0900;
    public static final int GL_CCW = 0x0901;
    public static final int GL_POINT_SIZE = 0x0B11;
    public static final int GL_POINT_SIZE_RANGE = 0x0B12;
    public static final int GL_POINT_SIZE_GRANULARITY = 0x0B13;
    public static final int GL_LINE_SMOOTH = 0x0B20;
    public static final int GL_LINE_WIDTH = 0x0B21;
    public static final int GL_LINE_WIDTH_RANGE = 0x0B22;
    public static final int GL_LINE_WIDTH_GRANULARITY = 0x0B23;
    public static final int GL_POLYGON_MODE = 0x0B40;
    public static final int GL_POLYGON_SMOOTH = 0x0B41;
    public static final int GL_CULL_FACE = 0x0B44;
    public static final int GL_CULL_FACE_MODE = 0x0B45;
    public static final int GL_FRONT_FACE = 0x0B46;
    public static final int GL_DEPTH_RANGE = 0x0B70;
    public static final int GL_DEPTH_TEST = 0x0B71;
    public static final int GL_DEPTH_WRITEMASK = 0x0B72;
    public static final int GL_DEPTH_CLEAR_VALUE = 0x0B73;
    public static final int GL_DEPTH_FUNC = 0x0B74;
    public static final int GL_STENCIL_TEST = 0x0B90;
    public static final int GL_STENCIL_CLEAR_VALUE = 0x0B91;
    public static final int GL_STENCIL_FUNC = 0x0B92;
    public static final int GL_STENCIL_VALUE_MASK = 0x0B93;
    public static final int GL_STENCIL_FAIL = 0x0B94;
    public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0x0B95;
    public static final int GL_STENCIL_PASS_DEPTH_PASS = 0x0B96;
    public static final int GL_STENCIL_REF = 0x0B97;
    public static final int GL_STENCIL_WRITEMASK = 0x0B98;
    public static final int GL_VIEWPORT = 0x0BA2;
    public static final int GL_DITHER = 0x0BD0;
    public static final int GL_BLEND_DST = 0x0BE0;
    public static final int GL_BLEND_SRC = 0x0BE1;
    public static final int GL_BLEND = 0x0BE2;
    public static final int GL_LOGIC_OP_MODE = 0x0BF0;
    public static final int GL_DRAW_BUFFER = 0x0C01;
    public static final int GL_READ_BUFFER = 0x0C02;
    public static final int GL_SCISSOR_BOX = 0x0C10;
    public static final int GL_SCISSOR_TEST = 0x0C11;
    public static final int GL_COLOR_CLEAR_VALUE = 0x0C22;
    public static final int GL_COLOR_WRITEMASK = 0x0C23;
    public static final int GL_DOUBLEBUFFER = 0x0C32;
    public static final int GL_STEREO = 0x0C33;
    public static final int GL_LINE_SMOOTH_HINT = 0x0C52;
    public static final int GL_POLYGON_SMOOTH_HINT = 0x0C53;
    public static final int GL_UNPACK_SWAP_BYTES = 0x0CF0;
    public static final int GL_UNPACK_LSB_FIRST = 0x0CF1;
    public static final int GL_UNPACK_ROW_LENGTH = 0x0CF2;
    public static final int GL_UNPACK_SKIP_ROWS = 0x0CF3;
    public static final int GL_UNPACK_SKIP_PIXELS = 0x0CF4;
    public static final int GL_UNPACK_ALIGNMENT = 0x0CF5;
    public static final int GL_PACK_SWAP_BYTES = 0x0D00;
    public static final int GL_PACK_LSB_FIRST = 0x0D01;
    public static final int GL_PACK_ROW_LENGTH = 0x0D02;
    public static final int GL_PACK_SKIP_ROWS = 0x0D03;
    public static final int GL_PACK_SKIP_PIXELS = 0x0D04;
    public static final int GL_PACK_ALIGNMENT = 0x0D05;
    public static final int GL_MAX_TEXTURE_SIZE = 0x0D33;
    public static final int GL_MAX_VIEWPORT_DIMS = 0x0D3A;
    public static final int GL_SUBPIXEL_BITS = 0x0D50;
    public static final int GL_TEXTURE_1D = 0x0DE0;
    public static final int GL_TEXTURE_2D = 0x0DE1;
    public static final int GL_TEXTURE_WIDTH = 0x1000;
    public static final int GL_TEXTURE_HEIGHT = 0x1001;
    public static final int GL_TEXTURE_BORDER_COLOR = 0x1004;
    public static final int GL_DONT_CARE = 0x1100;
    public static final int GL_FASTEST = 0x1101;
    public static final int GL_NICEST = 0x1102;
    public static final int GL_BYTE = 0x1400;
    public static final int GL_UNSIGNED_BYTE = 0x1401;
    public static final int GL_SHORT = 0x1402;
    public static final int GL_UNSIGNED_SHORT = 0x1403;
    public static final int GL_INT = 0x1404;
    public static final int GL_UNSIGNED_INT = 0x1405;
    public static final int GL_FLOAT = 0x1406;
    public static final int GL_STACK_OVERFLOW = 0x0503;
    public static final int GL_STACK_UNDERFLOW = 0x0504;
    public static final int GL_CLEAR = 0x1500;
    public static final int GL_AND = 0x1501;
    public static final int GL_AND_REVERSE = 0x1502;
    public static final int GL_COPY = 0x1503;
    public static final int GL_AND_INVERTED = 0x1504;
    public static final int GL_NOOP = 0x1505;
    public static final int GL_XOR = 0x1506;
    public static final int GL_OR = 0x1507;
    public static final int GL_NOR = 0x1508;
    public static final int GL_EQUIV = 0x1509;
    public static final int GL_INVERT = 0x150A;
    public static final int GL_OR_REVERSE = 0x150B;
    public static final int GL_COPY_INVERTED = 0x150C;
    public static final int GL_OR_INVERTED = 0x150D;
    public static final int GL_NAND = 0x150E;
    public static final int GL_SET = 0x150F;
    public static final int GL_TEXTURE = 0x1702;
    public static final int GL_COLOR = 0x1800;
    public static final int GL_DEPTH = 0x1801;
    public static final int GL_STENCIL = 0x1802;
    public static final int GL_STENCIL_INDEX = 0x1901;
    public static final int GL_DEPTH_COMPONENT = 0x1902;
    public static final int GL_RED = 0x1903;
    public static final int GL_GREEN = 0x1904;
    public static final int GL_BLUE = 0x1905;
    public static final int GL_ALPHA = 0x1906;
    public static final int GL_RGB = 0x1907;
    public static final int GL_RGBA = 0x1908;
    public static final int GL_POINT = 0x1B00;
    public static final int GL_LINE = 0x1B01;
    public static final int GL_FILL = 0x1B02;
    public static final int GL_KEEP = 0x1E00;
    public static final int GL_REPLACE = 0x1E01;
    public static final int GL_INCR = 0x1E02;
    public static final int GL_DECR = 0x1E03;
    public static final int GL_VENDOR = 0x1F00;
    public static final int GL_RENDERER = 0x1F01;
    public static final int GL_VERSION = 0x1F02;
    public static final int GL_EXTENSIONS = 0x1F03;
    public static final int GL_NEAREST = 0x2600;
    public static final int GL_LINEAR = 0x2601;
    public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;
    public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;
    public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;
    public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;
    public static final int GL_TEXTURE_MAG_FILTER = 0x2800;
    public static final int GL_TEXTURE_MIN_FILTER = 0x2801;
    public static final int GL_TEXTURE_WRAP_S = 0x2802;
    public static final int GL_TEXTURE_WRAP_T = 0x2803;
    public static final int GL_REPEAT = 0x2901;
    public static final int GL_VERSION_1_1 = 1;
    public static final int GL_COLOR_LOGIC_OP = 0x0BF2;
    public static final int GL_POLYGON_OFFSET_UNITS = 0x2A00;
    public static final int GL_POLYGON_OFFSET_POINT = 0x2A01;
    public static final int GL_POLYGON_OFFSET_LINE = 0x2A02;
    public static final int GL_POLYGON_OFFSET_FILL = 0x8037;
    public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;
    public static final int GL_TEXTURE_BINDING_1D = 0x8068;
    public static final int GL_TEXTURE_BINDING_2D = 0x8069;
    public static final int GL_TEXTURE_INTERNAL_FORMAT = 0x1003;
    public static final int GL_TEXTURE_RED_SIZE = 0x805C;
    public static final int GL_TEXTURE_GREEN_SIZE = 0x805D;
    public static final int GL_TEXTURE_BLUE_SIZE = 0x805E;
    public static final int GL_TEXTURE_ALPHA_SIZE = 0x805F;
    public static final int GL_DOUBLE = 0x140A;
    public static final int GL_PROXY_TEXTURE_1D = 0x8063;
    public static final int GL_PROXY_TEXTURE_2D = 0x8064;
    public static final int GL_R3_G3_B2 = 0x2A10;
    public static final int GL_RGB4 = 0x804F;
    public static final int GL_RGB5 = 0x8050;
    public static final int GL_RGB8 = 0x8051;
    public static final int GL_RGB10 = 0x8052;
    public static final int GL_RGB12 = 0x8053;
    public static final int GL_RGB16 = 0x8054;
    public static final int GL_RGBA2 = 0x8055;
    public static final int GL_RGBA4 = 0x8056;
    public static final int GL_RGB5_A1 = 0x8057;
    public static final int GL_RGBA8 = 0x8058;
    public static final int GL_RGB10_A2 = 0x8059;
    public static final int GL_RGBA12 = 0x805A;
    public static final int GL_RGBA16 = 0x805B;
    public static final int GL_VERTEX_ARRAY = 0x8074;
    public static final int GL_VERSION_1_2 = 1;
    public static final int GL_UNSIGNED_BYTE_3_3_2 = 0x8032;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;
    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;
    public static final int GL_UNSIGNED_INT_8_8_8_8 = 0x8035;
    public static final int GL_UNSIGNED_INT_10_10_10_2 = 0x8036;
    public static final int GL_TEXTURE_BINDING_3D = 0x806A;
    public static final int GL_PACK_SKIP_IMAGES = 0x806B;
    public static final int GL_PACK_IMAGE_HEIGHT = 0x806C;
    public static final int GL_UNPACK_SKIP_IMAGES = 0x806D;
    public static final int GL_UNPACK_IMAGE_HEIGHT = 0x806E;
    public static final int GL_TEXTURE_3D = 0x806F;
    public static final int GL_PROXY_TEXTURE_3D = 0x8070;
    public static final int GL_TEXTURE_DEPTH = 0x8071;
    public static final int GL_TEXTURE_WRAP_R = 0x8072;
    public static final int GL_MAX_3D_TEXTURE_SIZE = 0x8073;
    public static final int GL_UNSIGNED_BYTE_2_3_3_REV = 0x8362;
    public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;
    public static final int GL_UNSIGNED_SHORT_5_6_5_REV = 0x8364;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4_REV = 0x8365;
    public static final int GL_UNSIGNED_SHORT_1_5_5_5_REV = 0x8366;
    public static final int GL_UNSIGNED_INT_8_8_8_8_REV = 0x8367;
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;
    public static final int GL_BGR = 0x80E0;
    public static final int GL_BGRA = 0x80E1;
    public static final int GL_MAX_ELEMENTS_VERTICES = 0x80E8;
    public static final int GL_MAX_ELEMENTS_INDICES = 0x80E9;
    public static final int GL_CLAMP_TO_EDGE = 0x812F;
    public static final int GL_TEXTURE_MIN_LOD = 0x813A;
    public static final int GL_TEXTURE_MAX_LOD = 0x813B;
    public static final int GL_TEXTURE_BASE_LEVEL = 0x813C;
    public static final int GL_TEXTURE_MAX_LEVEL = 0x813D;
    public static final int GL_SMOOTH_POINT_SIZE_RANGE = 0x0B12;
    public static final int GL_SMOOTH_POINT_SIZE_GRANULARITY = 0x0B13;
    public static final int GL_SMOOTH_LINE_WIDTH_RANGE = 0x0B22;
    public static final int GL_SMOOTH_LINE_WIDTH_GRANULARITY = 0x0B23;
    public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846E;
    public static final int GL_VERSION_1_3 = 1;
    public static final int GL_TEXTURE0 = 0x84C0;
    public static final int GL_TEXTURE1 = 0x84C1;
    public static final int GL_TEXTURE2 = 0x84C2;
    public static final int GL_TEXTURE3 = 0x84C3;
    public static final int GL_TEXTURE4 = 0x84C4;
    public static final int GL_TEXTURE5 = 0x84C5;
    public static final int GL_TEXTURE6 = 0x84C6;
    public static final int GL_TEXTURE7 = 0x84C7;
    public static final int GL_TEXTURE8 = 0x84C8;
    public static final int GL_TEXTURE9 = 0x84C9;
    public static final int GL_TEXTURE10 = 0x84CA;
    public static final int GL_TEXTURE11 = 0x84CB;
    public static final int GL_TEXTURE12 = 0x84CC;
    public static final int GL_TEXTURE13 = 0x84CD;
    public static final int GL_TEXTURE14 = 0x84CE;
    public static final int GL_TEXTURE15 = 0x84CF;
    public static final int GL_TEXTURE16 = 0x84D0;
    public static final int GL_TEXTURE17 = 0x84D1;
    public static final int GL_TEXTURE18 = 0x84D2;
    public static final int GL_TEXTURE19 = 0x84D3;
    public static final int GL_TEXTURE20 = 0x84D4;
    public static final int GL_TEXTURE21 = 0x84D5;
    public static final int GL_TEXTURE22 = 0x84D6;
    public static final int GL_TEXTURE23 = 0x84D7;
    public static final int GL_TEXTURE24 = 0x84D8;
    public static final int GL_TEXTURE25 = 0x84D9;
    public static final int GL_TEXTURE26 = 0x84DA;
    public static final int GL_TEXTURE27 = 0x84DB;
    public static final int GL_TEXTURE28 = 0x84DC;
    public static final int GL_TEXTURE29 = 0x84DD;
    public static final int GL_TEXTURE30 = 0x84DE;
    public static final int GL_TEXTURE31 = 0x84DF;
    public static final int GL_ACTIVE_TEXTURE = 0x84E0;
    public static final int GL_MULTISAMPLE = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE = 0x809F;
    public static final int GL_SAMPLE_COVERAGE = 0x80A0;
    public static final int GL_SAMPLE_BUFFERS = 0x80A8;
    public static final int GL_SAMPLES = 0x80A9;
    public static final int GL_SAMPLE_COVERAGE_VALUE = 0x80AA;
    public static final int GL_SAMPLE_COVERAGE_INVERT = 0x80AB;
    public static final int GL_TEXTURE_CUBE_MAP = 0x8513;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
    public static final int GL_PROXY_TEXTURE_CUBE_MAP = 0x851B;
    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
    public static final int GL_COMPRESSED_RGB = 0x84ED;
    public static final int GL_COMPRESSED_RGBA = 0x84EE;
    public static final int GL_TEXTURE_COMPRESSION_HINT = 0x84EF;
    public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0;
    public static final int GL_TEXTURE_COMPRESSED = 0x86A1;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86A3;
    public static final int GL_CLAMP_TO_BORDER = 0x812D;
    public static final int GL_VERSION_1_4 = 1;
    public static final int GL_BLEND_DST_RGB = 0x80C8;
    public static final int GL_BLEND_SRC_RGB = 0x80C9;
    public static final int GL_BLEND_DST_ALPHA = 0x80CA;
    public static final int GL_BLEND_SRC_ALPHA = 0x80CB;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 0x8128;
    public static final int GL_DEPTH_COMPONENT16 = 0x81A5;
    public static final int GL_DEPTH_COMPONENT24 = 0x81A6;
    public static final int GL_DEPTH_COMPONENT32 = 0x81A7;
    public static final int GL_MIRRORED_REPEAT = 0x8370;
    public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;
    public static final int GL_TEXTURE_LOD_BIAS = 0x8501;
    public static final int GL_INCR_WRAP = 0x8507;
    public static final int GL_DECR_WRAP = 0x8508;
    public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;
    public static final int GL_TEXTURE_COMPARE_MODE = 0x884C;
    public static final int GL_TEXTURE_COMPARE_FUNC = 0x884D;
    public static final int GL_BLEND_COLOR = 0x8005;
    public static final int GL_BLEND_EQUATION = 0x8009;
    public static final int GL_CONSTANT_COLOR = 0x8001;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;
    public static final int GL_CONSTANT_ALPHA = 0x8003;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;
    public static final int GL_FUNC_ADD = 0x8006;
    public static final int GL_FUNC_REVERSE_SUBTRACT = 0x800B;
    public static final int GL_FUNC_SUBTRACT = 0x800A;
    public static final int GL_MIN = 0x8007;
    public static final int GL_MAX = 0x8008;
    public static final int GL_VERSION_1_5 = 1;
    public static final int GL_BUFFER_SIZE = 0x8764;
    public static final int GL_BUFFER_USAGE = 0x8765;
    public static final int GL_QUERY_COUNTER_BITS = 0x8864;
    public static final int GL_CURRENT_QUERY = 0x8865;
    public static final int GL_QUERY_RESULT = 0x8866;
    public static final int GL_QUERY_RESULT_AVAILABLE = 0x8867;
    public static final int GL_ARRAY_BUFFER = 0x8892;
    public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;
    public static final int GL_ARRAY_BUFFER_BINDING = 0x8894;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
    public static final int GL_READ_ONLY = 0x88B8;
    public static final int GL_WRITE_ONLY = 0x88B9;
    public static final int GL_READ_WRITE = 0x88BA;
    public static final int GL_BUFFER_ACCESS = 0x88BB;
    public static final int GL_BUFFER_MAPPED = 0x88BC;
    public static final int GL_BUFFER_MAP_POINTER = 0x88BD;
    public static final int GL_STREAM_DRAW = 0x88E0;
    public static final int GL_STREAM_READ = 0x88E1;
    public static final int GL_STREAM_COPY = 0x88E2;
    public static final int GL_STATIC_DRAW = 0x88E4;
    public static final int GL_STATIC_READ = 0x88E5;
    public static final int GL_STATIC_COPY = 0x88E6;
    public static final int GL_DYNAMIC_DRAW = 0x88E8;
    public static final int GL_DYNAMIC_READ = 0x88E9;
    public static final int GL_DYNAMIC_COPY = 0x88EA;
    public static final int GL_SAMPLES_PASSED = 0x8914;
    public static final int GL_SRC1_ALPHA = 0x8589;
    public static final int GL_VERSION_2_0 = 1;
    public static final int GL_BLEND_EQUATION_RGB = 0x8009;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;
    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;
    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;
    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;
    public static final int GL_CURRENT_VERTEX_ATTRIB = 0x8626;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
    public static final int GL_STENCIL_BACK_FUNC = 0x8800;
    public static final int GL_STENCIL_BACK_FAIL = 0x8801;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
    public static final int GL_MAX_DRAW_BUFFERS = 0x8824;
    public static final int GL_DRAW_BUFFER0 = 0x8825;
    public static final int GL_DRAW_BUFFER1 = 0x8826;
    public static final int GL_DRAW_BUFFER2 = 0x8827;
    public static final int GL_DRAW_BUFFER3 = 0x8828;
    public static final int GL_DRAW_BUFFER4 = 0x8829;
    public static final int GL_DRAW_BUFFER5 = 0x882A;
    public static final int GL_DRAW_BUFFER6 = 0x882B;
    public static final int GL_DRAW_BUFFER7 = 0x882C;
    public static final int GL_DRAW_BUFFER8 = 0x882D;
    public static final int GL_DRAW_BUFFER9 = 0x882E;
    public static final int GL_DRAW_BUFFER10 = 0x882F;
    public static final int GL_DRAW_BUFFER11 = 0x8830;
    public static final int GL_DRAW_BUFFER12 = 0x8831;
    public static final int GL_DRAW_BUFFER13 = 0x8832;
    public static final int GL_DRAW_BUFFER14 = 0x8833;
    public static final int GL_DRAW_BUFFER15 = 0x8834;
    public static final int GL_BLEND_EQUATION_ALPHA = 0x883D;
    public static final int GL_MAX_VERTEX_ATTRIBS = 0x8869;
    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;
    public static final int GL_FRAGMENT_SHADER = 0x8B30;
    public static final int GL_VERTEX_SHADER = 0x8B31;
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;
    public static final int GL_MAX_VARYING_FLOATS = 0x8B4B;
    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
    public static final int GL_SHADER_TYPE = 0x8B4F;
    public static final int GL_FLOAT_VEC2 = 0x8B50;
    public static final int GL_FLOAT_VEC3 = 0x8B51;
    public static final int GL_FLOAT_VEC4 = 0x8B52;
    public static final int GL_INT_VEC2 = 0x8B53;
    public static final int GL_INT_VEC3 = 0x8B54;
    public static final int GL_INT_VEC4 = 0x8B55;
    public static final int GL_BOOL = 0x8B56;
    public static final int GL_BOOL_VEC2 = 0x8B57;
    public static final int GL_BOOL_VEC3 = 0x8B58;
    public static final int GL_BOOL_VEC4 = 0x8B59;
    public static final int GL_FLOAT_MAT2 = 0x8B5A;
    public static final int GL_FLOAT_MAT3 = 0x8B5B;
    public static final int GL_FLOAT_MAT4 = 0x8B5C;
    public static final int GL_SAMPLER_1D = 0x8B5D;
    public static final int GL_SAMPLER_2D = 0x8B5E;
    public static final int GL_SAMPLER_3D = 0x8B5F;
    public static final int GL_SAMPLER_CUBE = 0x8B60;
    public static final int GL_SAMPLER_1D_SHADOW = 0x8B61;
    public static final int GL_SAMPLER_2D_SHADOW = 0x8B62;
    public static final int GL_DELETE_STATUS = 0x8B80;
    public static final int GL_COMPILE_STATUS = 0x8B81;
    public static final int GL_LINK_STATUS = 0x8B82;
    public static final int GL_VALIDATE_STATUS = 0x8B83;
    public static final int GL_INFO_LOG_LENGTH = 0x8B84;
    public static final int GL_ATTACHED_SHADERS = 0x8B85;
    public static final int GL_ACTIVE_UNIFORMS = 0x8B86;
    public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;
    public static final int GL_SHADER_SOURCE_LENGTH = 0x8B88;
    public static final int GL_ACTIVE_ATTRIBUTES = 0x8B89;
    public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
    public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;
    public static final int GL_CURRENT_PROGRAM = 0x8B8D;
    public static final int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;
    public static final int GL_LOWER_LEFT = 0x8CA1;
    public static final int GL_UPPER_LEFT = 0x8CA2;
    public static final int GL_STENCIL_BACK_REF = 0x8CA3;
    public static final int GL_STENCIL_BACK_VALUE_MASK = 0x8CA4;
    public static final int GL_STENCIL_BACK_WRITEMASK = 0x8CA5;
    public static final int GL_VERSION_2_1 = 1;
    public static final int GL_PIXEL_PACK_BUFFER = 0x88EB;
    public static final int GL_PIXEL_UNPACK_BUFFER = 0x88EC;
    public static final int GL_PIXEL_PACK_BUFFER_BINDING = 0x88ED;
    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;
    public static final int GL_FLOAT_MAT2x3 = 0x8B65;
    public static final int GL_FLOAT_MAT2x4 = 0x8B66;
    public static final int GL_FLOAT_MAT3x2 = 0x8B67;
    public static final int GL_FLOAT_MAT3x4 = 0x8B68;
    public static final int GL_FLOAT_MAT4x2 = 0x8B69;
    public static final int GL_FLOAT_MAT4x3 = 0x8B6A;
    public static final int GL_SRGB = 0x8C40;
    public static final int GL_SRGB8 = 0x8C41;
    public static final int GL_SRGB_ALPHA = 0x8C42;
    public static final int GL_SRGB8_ALPHA8 = 0x8C43;
    public static final int GL_COMPRESSED_SRGB = 0x8C48;
    public static final int GL_COMPRESSED_SRGB_ALPHA = 0x8C49;
    public static final int GL_VERSION_3_0 = 1;
    public static final int GL_COMPARE_REF_TO_TEXTURE = 0x884E;
    public static final int GL_CLIP_DISTANCE0 = 0x3000;
    public static final int GL_CLIP_DISTANCE1 = 0x3001;
    public static final int GL_CLIP_DISTANCE2 = 0x3002;
    public static final int GL_CLIP_DISTANCE3 = 0x3003;
    public static final int GL_CLIP_DISTANCE4 = 0x3004;
    public static final int GL_CLIP_DISTANCE5 = 0x3005;
    public static final int GL_CLIP_DISTANCE6 = 0x3006;
    public static final int GL_CLIP_DISTANCE7 = 0x3007;
    public static final int GL_MAX_CLIP_DISTANCES = 0x0D32;
    public static final int GL_MAJOR_VERSION = 0x821B;
    public static final int GL_MINOR_VERSION = 0x821C;
    public static final int GL_NUM_EXTENSIONS = 0x821D;
    public static final int GL_CONTEXT_FLAGS = 0x821E;
    public static final int GL_COMPRESSED_RED = 0x8225;
    public static final int GL_COMPRESSED_RG = 0x8226;
    public static final int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x00000001;
    public static final int GL_RGBA32F = 0x8814;
    public static final int GL_RGB32F = 0x8815;
    public static final int GL_RGBA16F = 0x881A;
    public static final int GL_RGB16F = 0x881B;
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;
    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;
    public static final int GL_CLAMP_READ_COLOR = 0x891C;
    public static final int GL_FIXED_ONLY = 0x891D;
    public static final int GL_MAX_VARYING_COMPONENTS = 0x8B4B;
    public static final int GL_TEXTURE_1D_ARRAY = 0x8C18;
    public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;
    public static final int GL_TEXTURE_2D_ARRAY = 0x8C1A;
    public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;
    public static final int GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
    public static final int GL_R11F_G11F_B10F = 0x8C3A;
    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
    public static final int GL_RGB9_E5 = 0x8C3D;
    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;
    public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;
    public static final int GL_PRIMITIVES_GENERATED = 0x8C87;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
    public static final int GL_RASTERIZER_DISCARD = 0x8C89;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
    public static final int GL_INTERLEAVED_ATTRIBS = 0x8C8C;
    public static final int GL_SEPARATE_ATTRIBS = 0x8C8D;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
    public static final int GL_RGBA32UI = 0x8D70;
    public static final int GL_RGB32UI = 0x8D71;
    public static final int GL_RGBA16UI = 0x8D76;
    public static final int GL_RGB16UI = 0x8D77;
    public static final int GL_RGBA8UI = 0x8D7C;
    public static final int GL_RGB8UI = 0x8D7D;
    public static final int GL_RGBA32I = 0x8D82;
    public static final int GL_RGB32I = 0x8D83;
    public static final int GL_RGBA16I = 0x8D88;
    public static final int GL_RGB16I = 0x8D89;
    public static final int GL_RGBA8I = 0x8D8E;
    public static final int GL_RGB8I = 0x8D8F;
    public static final int GL_RED_INTEGER = 0x8D94;
    public static final int GL_GREEN_INTEGER = 0x8D95;
    public static final int GL_BLUE_INTEGER = 0x8D96;
    public static final int GL_RGB_INTEGER = 0x8D98;
    public static final int GL_RGBA_INTEGER = 0x8D99;
    public static final int GL_BGR_INTEGER = 0x8D9A;
    public static final int GL_BGRA_INTEGER = 0x8D9B;
    public static final int GL_SAMPLER_1D_ARRAY = 0x8DC0;
    public static final int GL_SAMPLER_2D_ARRAY = 0x8DC1;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW = 0x8DC3;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;
    public static final int GL_SAMPLER_CUBE_SHADOW = 0x8DC5;
    public static final int GL_UNSIGNED_INT_VEC2 = 0x8DC6;
    public static final int GL_UNSIGNED_INT_VEC3 = 0x8DC7;
    public static final int GL_UNSIGNED_INT_VEC4 = 0x8DC8;
    public static final int GL_INT_SAMPLER_1D = 0x8DC9;
    public static final int GL_INT_SAMPLER_2D = 0x8DCA;
    public static final int GL_INT_SAMPLER_3D = 0x8DCB;
    public static final int GL_INT_SAMPLER_CUBE = 0x8DCC;
    public static final int GL_INT_SAMPLER_1D_ARRAY = 0x8DCE;
    public static final int GL_INT_SAMPLER_2D_ARRAY = 0x8DCF;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D = 0x8DD1;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D = 0x8DD2;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D = 0x8DD3;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
    public static final int GL_QUERY_WAIT = 0x8E13;
    public static final int GL_QUERY_NO_WAIT = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;
    public static final int GL_BUFFER_ACCESS_FLAGS = 0x911F;
    public static final int GL_BUFFER_MAP_LENGTH = 0x9120;
    public static final int GL_BUFFER_MAP_OFFSET = 0x9121;
    public static final int GL_DEPTH_COMPONENT32F = 0x8CAC;
    public static final int GL_DEPTH32F_STENCIL8 = 0x8CAD;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x0506;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
    public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;
    public static final int GL_FRAMEBUFFER_UNDEFINED = 0x8219;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;
    public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84E8;
    public static final int GL_DEPTH_STENCIL = 0x84F9;
    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;
    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;
    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;
    public static final int GL_TEXTURE_RED_TYPE = 0x8C10;
    public static final int GL_TEXTURE_GREEN_TYPE = 0x8C11;
    public static final int GL_TEXTURE_BLUE_TYPE = 0x8C12;
    public static final int GL_TEXTURE_ALPHA_TYPE = 0x8C13;
    public static final int GL_TEXTURE_DEPTH_TYPE = 0x8C16;
    public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;
    public static final int GL_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_RENDERBUFFER_BINDING = 0x8CA7;
    public static final int GL_READ_FRAMEBUFFER = 0x8CA8;
    public static final int GL_DRAW_FRAMEBUFFER = 0x8CA9;
    public static final int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;
    public static final int GL_RENDERBUFFER_SAMPLES = 0x8CAB;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
    public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 0x8CDB;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 0x8CDC;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
    public static final int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;
    public static final int GL_COLOR_ATTACHMENT0 = 0x8CE0;
    public static final int GL_COLOR_ATTACHMENT1 = 0x8CE1;
    public static final int GL_COLOR_ATTACHMENT2 = 0x8CE2;
    public static final int GL_COLOR_ATTACHMENT3 = 0x8CE3;
    public static final int GL_COLOR_ATTACHMENT4 = 0x8CE4;
    public static final int GL_COLOR_ATTACHMENT5 = 0x8CE5;
    public static final int GL_COLOR_ATTACHMENT6 = 0x8CE6;
    public static final int GL_COLOR_ATTACHMENT7 = 0x8CE7;
    public static final int GL_COLOR_ATTACHMENT8 = 0x8CE8;
    public static final int GL_COLOR_ATTACHMENT9 = 0x8CE9;
    public static final int GL_COLOR_ATTACHMENT10 = 0x8CEA;
    public static final int GL_COLOR_ATTACHMENT11 = 0x8CEB;
    public static final int GL_COLOR_ATTACHMENT12 = 0x8CEC;
    public static final int GL_COLOR_ATTACHMENT13 = 0x8CED;
    public static final int GL_COLOR_ATTACHMENT14 = 0x8CEE;
    public static final int GL_COLOR_ATTACHMENT15 = 0x8CEF;
    public static final int GL_COLOR_ATTACHMENT16 = 0x8CF0;
    public static final int GL_COLOR_ATTACHMENT17 = 0x8CF1;
    public static final int GL_COLOR_ATTACHMENT18 = 0x8CF2;
    public static final int GL_COLOR_ATTACHMENT19 = 0x8CF3;
    public static final int GL_COLOR_ATTACHMENT20 = 0x8CF4;
    public static final int GL_COLOR_ATTACHMENT21 = 0x8CF5;
    public static final int GL_COLOR_ATTACHMENT22 = 0x8CF6;
    public static final int GL_COLOR_ATTACHMENT23 = 0x8CF7;
    public static final int GL_COLOR_ATTACHMENT24 = 0x8CF8;
    public static final int GL_COLOR_ATTACHMENT25 = 0x8CF9;
    public static final int GL_COLOR_ATTACHMENT26 = 0x8CFA;
    public static final int GL_COLOR_ATTACHMENT27 = 0x8CFB;
    public static final int GL_COLOR_ATTACHMENT28 = 0x8CFC;
    public static final int GL_COLOR_ATTACHMENT29 = 0x8CFD;
    public static final int GL_COLOR_ATTACHMENT30 = 0x8CFE;
    public static final int GL_COLOR_ATTACHMENT31 = 0x8CFF;
    public static final int GL_DEPTH_ATTACHMENT = 0x8D00;
    public static final int GL_STENCIL_ATTACHMENT = 0x8D20;
    public static final int GL_FRAMEBUFFER = 0x8D40;
    public static final int GL_RENDERBUFFER = 0x8D41;
    public static final int GL_RENDERBUFFER_WIDTH = 0x8D42;
    public static final int GL_RENDERBUFFER_HEIGHT = 0x8D43;
    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
    public static final int GL_STENCIL_INDEX1 = 0x8D46;
    public static final int GL_STENCIL_INDEX4 = 0x8D47;
    public static final int GL_STENCIL_INDEX8 = 0x8D48;
    public static final int GL_STENCIL_INDEX16 = 0x8D49;
    public static final int GL_RENDERBUFFER_RED_SIZE = 0x8D50;
    public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8D51;
    public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8D52;
    public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8D53;
    public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8D54;
    public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8D55;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
    public static final int GL_MAX_SAMPLES = 0x8D57;
    public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;
    public static final int GL_HALF_FLOAT = 0x140B;
    public static final int GL_MAP_READ_BIT = 0x0001;
    public static final int GL_MAP_WRITE_BIT = 0x0002;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;
    public static final int GL_COMPRESSED_RED_RGTC1 = 0x8DBB;
    public static final int GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC;
    public static final int GL_COMPRESSED_RG_RGTC2 = 0x8DBD;
    public static final int GL_COMPRESSED_SIGNED_RG_RGTC2 = 0x8DBE;
    public static final int GL_RG = 0x8227;
    public static final int GL_RG_INTEGER = 0x8228;
    public static final int GL_R8 = 0x8229;
    public static final int GL_R16 = 0x822A;
    public static final int GL_RG8 = 0x822B;
    public static final int GL_RG16 = 0x822C;
    public static final int GL_R16F = 0x822D;
    public static final int GL_R32F = 0x822E;
    public static final int GL_RG16F = 0x822F;
    public static final int GL_RG32F = 0x8230;
    public static final int GL_R8I = 0x8231;
    public static final int GL_R8UI = 0x8232;
    public static final int GL_R16I = 0x8233;
    public static final int GL_R16UI = 0x8234;
    public static final int GL_R32I = 0x8235;
    public static final int GL_R32UI = 0x8236;
    public static final int GL_RG8I = 0x8237;
    public static final int GL_RG8UI = 0x8238;
    public static final int GL_RG16I = 0x8239;
    public static final int GL_RG16UI = 0x823A;
    public static final int GL_RG32I = 0x823B;
    public static final int GL_RG32UI = 0x823C;
    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;
    public static final int GL_VERSION_3_1 = 1;
    public static final int GL_SAMPLER_2D_RECT = 0x8B63;
    public static final int GL_SAMPLER_2D_RECT_SHADOW = 0x8B64;
    public static final int GL_SAMPLER_BUFFER = 0x8DC2;
    public static final int GL_INT_SAMPLER_2D_RECT = 0x8DCD;
    public static final int GL_INT_SAMPLER_BUFFER = 0x8DD0;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8;
    public static final int GL_TEXTURE_BUFFER = 0x8C2A;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE = 0x8C2B;
    public static final int GL_TEXTURE_BINDING_BUFFER = 0x8C2C;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;
    public static final int GL_TEXTURE_RECTANGLE = 0x84F5;
    public static final int GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;
    public static final int GL_PROXY_TEXTURE_RECTANGLE = 0x84F7;
    public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;
    public static final int GL_R8_SNORM = 0x8F94;
    public static final int GL_RG8_SNORM = 0x8F95;
    public static final int GL_RGB8_SNORM = 0x8F96;
    public static final int GL_RGBA8_SNORM = 0x8F97;
    public static final int GL_R16_SNORM = 0x8F98;
    public static final int GL_RG16_SNORM = 0x8F99;
    public static final int GL_RGB16_SNORM = 0x8F9A;
    public static final int GL_RGBA16_SNORM = 0x8F9B;
    public static final int GL_SIGNED_NORMALIZED = 0x8F9C;
    public static final int GL_PRIMITIVE_RESTART = 0x8F9D;
    public static final int GL_PRIMITIVE_RESTART_INDEX = 0x8F9E;
    public static final int GL_COPY_READ_BUFFER = 0x8F36;
    public static final int GL_COPY_WRITE_BUFFER = 0x8F37;
    public static final int GL_UNIFORM_BUFFER = 0x8A11;
    public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;
    public static final int GL_UNIFORM_BUFFER_START = 0x8A29;
    public static final int GL_UNIFORM_BUFFER_SIZE = 0x8A2A;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 0x8A2C;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 0x8A30;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
    public static final int GL_ACTIVE_UNIFORM_BLOCKS = 0x8A36;
    public static final int GL_UNIFORM_TYPE = 0x8A37;
    public static final int GL_UNIFORM_SIZE = 0x8A38;
    public static final int GL_UNIFORM_NAME_LENGTH = 0x8A39;
    public static final int GL_UNIFORM_BLOCK_INDEX = 0x8A3A;
    public static final int GL_UNIFORM_OFFSET = 0x8A3B;
    public static final int GL_UNIFORM_ARRAY_STRIDE = 0x8A3C;
    public static final int GL_UNIFORM_MATRIX_STRIDE = 0x8A3D;
    public static final int GL_UNIFORM_IS_ROW_MAJOR = 0x8A3E;
    public static final int GL_UNIFORM_BLOCK_BINDING = 0x8A3F;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 0x8A40;
    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
    public static final int GL_INVALID_INDEX = 0xFFFFFFFF;
    public static final int GL_VERSION_3_2 = 1;
    public static final int GL_CONTEXT_CORE_PROFILE_BIT = 0x00000001;
    public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x00000002;
    public static final int GL_LINES_ADJACENCY = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY = 0x000D;
    public static final int GL_PROGRAM_POINT_SIZE = 0x8642;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 0x8C29;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;
    public static final int GL_GEOMETRY_SHADER = 0x8DD9;
    public static final int GL_GEOMETRY_VERTICES_OUT = 0x8916;
    public static final int GL_GEOMETRY_INPUT_TYPE = 0x8917;
    public static final int GL_GEOMETRY_OUTPUT_TYPE = 0x8918;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 0x8DDF;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 0x8DE0;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;
    public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
    public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS = 0x9123;
    public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124;
    public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;
    public static final int GL_CONTEXT_PROFILE_MASK = 0x9126;
    public static final int GL_DEPTH_CLAMP = 0x864F;
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;
    public static final int GL_FIRST_VERTEX_CONVENTION = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX = 0x8E4F;
    public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;
    public static final int GL_OBJECT_TYPE = 0x9112;
    public static final int GL_SYNC_CONDITION = 0x9113;
    public static final int GL_SYNC_STATUS = 0x9114;
    public static final int GL_SYNC_FLAGS = 0x9115;
    public static final int GL_SYNC_FENCE = 0x9116;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
    public static final int GL_UNSIGNALED = 0x9118;
    public static final int GL_SIGNALED = 0x9119;
    public static final int GL_ALREADY_SIGNALED = 0x911A;
    public static final int GL_TIMEOUT_EXPIRED = 0x911B;
    public static final int GL_CONDITION_SATISFIED = 0x911C;
    public static final int GL_WAIT_FAILED = 0x911D;
    public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
    public static final int GL_SAMPLE_POSITION = 0x8E50;
    public static final int GL_SAMPLE_MASK = 0x8E51;
    public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;
    public static final int GL_MAX_SAMPLE_MASK_WORDS = 0x8E59;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
    public static final int GL_TEXTURE_SAMPLES = 0x9106;
    public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
    public static final int GL_SAMPLER_2D_MULTISAMPLE = 0x9108;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 0x9109;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
    public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;
    public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 0x910E;
    public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 0x910F;
    public static final int GL_MAX_INTEGER_SAMPLES = 0x9110;
    public static final int GL_VERSION_3_3 = 1;
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;
    public static final int GL_SRC1_COLOR = 0x88F9;
    public static final int GL_ONE_MINUS_SRC1_COLOR = 0x88FA;
    public static final int GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;
    public static final int GL_ANY_SAMPLES_PASSED = 0x8C2F;
    public static final int GL_SAMPLER_BINDING = 0x8919;
    public static final int GL_RGB10_A2UI = 0x906F;
    public static final int GL_TEXTURE_SWIZZLE_R = 0x8E42;
    public static final int GL_TEXTURE_SWIZZLE_G = 0x8E43;
    public static final int GL_TEXTURE_SWIZZLE_B = 0x8E44;
    public static final int GL_TEXTURE_SWIZZLE_A = 0x8E45;
    public static final int GL_TEXTURE_SWIZZLE_RGBA = 0x8E46;
    public static final int GL_TIME_ELAPSED = 0x88BF;
    public static final int GL_TIMESTAMP = 0x8E28;
    public static final int GL_INT_2_10_10_10_REV = 0x8D9F;
    public static final int GL_VERSION_4_0 = 1;
    public static final int GL_SAMPLE_SHADING = 0x8C36;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE = 0x8C37;
    public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5E;
    public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5F;
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 0x9009;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;
    public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 0x900B;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY = 0x900C;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW = 0x900D;
    public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900E;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F;
    public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;
    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;
    public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 0x887F;
    public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS = 0x8E5A;
    public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5B;
    public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5C;
    public static final int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;
    public static final int GL_MAX_VERTEX_STREAMS = 0x8E71;
    public static final int GL_DOUBLE_VEC2 = 0x8FFC;
    public static final int GL_DOUBLE_VEC3 = 0x8FFD;
    public static final int GL_DOUBLE_VEC4 = 0x8FFE;
    public static final int GL_DOUBLE_MAT2 = 0x8F46;
    public static final int GL_DOUBLE_MAT3 = 0x8F47;
    public static final int GL_DOUBLE_MAT4 = 0x8F48;
    public static final int GL_DOUBLE_MAT2x3 = 0x8F49;
    public static final int GL_DOUBLE_MAT2x4 = 0x8F4A;
    public static final int GL_DOUBLE_MAT3x2 = 0x8F4B;
    public static final int GL_DOUBLE_MAT3x4 = 0x8F4C;
    public static final int GL_DOUBLE_MAT4x2 = 0x8F4D;
    public static final int GL_DOUBLE_MAT4x3 = 0x8F4E;
    public static final int GL_ACTIVE_SUBROUTINES = 0x8DE5;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 0x8DE6;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 0x8E47;
    public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 0x8E48;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;
    public static final int GL_MAX_SUBROUTINES = 0x8DE7;
    public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;
    public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A;
    public static final int GL_COMPATIBLE_SUBROUTINES = 0x8E4B;
    public static final int GL_PATCHES = 0x000E;
    public static final int GL_PATCH_VERTICES = 0x8E72;
    public static final int GL_PATCH_DEFAULT_INNER_LEVEL = 0x8E73;
    public static final int GL_PATCH_DEFAULT_OUTER_LEVEL = 0x8E74;
    public static final int GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75;
    public static final int GL_TESS_GEN_MODE = 0x8E76;
    public static final int GL_TESS_GEN_SPACING = 0x8E77;
    public static final int GL_TESS_GEN_VERTEX_ORDER = 0x8E78;
    public static final int GL_TESS_GEN_POINT_MODE = 0x8E79;
    public static final int GL_ISOLINES = 0x8E7A;
    public static final int GL_FRACTIONAL_ODD = 0x8E7B;
    public static final int GL_FRACTIONAL_EVEN = 0x8E7C;
    public static final int GL_MAX_PATCH_VERTICES = 0x8E7D;
    public static final int GL_MAX_TESS_GEN_LEVEL = 0x8E7E;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E7F;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E80;
    public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 0x8E81;
    public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 0x8E82;
    public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 0x8E83;
    public static final int GL_MAX_TESS_PATCH_COMPONENTS = 0x8E84;
    public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 0x8E85;
    public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 0x8E86;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = 0x8E89;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 0x8E8A;
    public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = 0x886C;
    public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = 0x886D;
    public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E1E;
    public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 0x84F0;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x84F1;
    public static final int GL_TESS_EVALUATION_SHADER = 0x8E87;
    public static final int GL_TESS_CONTROL_SHADER = 0x8E88;
    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = 0x8E25;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70;
    public static final int GL_VERSION_4_1 = 1;
    public static final int GL_FIXED = 0x140C;
    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;
    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;
    public static final int GL_LOW_FLOAT = 0x8DF0;
    public static final int GL_MEDIUM_FLOAT = 0x8DF1;
    public static final int GL_HIGH_FLOAT = 0x8DF2;
    public static final int GL_LOW_INT = 0x8DF3;
    public static final int GL_MEDIUM_INT = 0x8DF4;
    public static final int GL_HIGH_INT = 0x8DF5;
    public static final int GL_SHADER_COMPILER = 0x8DFA;
    public static final int GL_SHADER_BINARY_FORMATS = 0x8DF8;
    public static final int GL_NUM_SHADER_BINARY_FORMATS = 0x8DF9;
    public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;
    public static final int GL_MAX_VARYING_VECTORS = 0x8DFC;
    public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;
    public static final int GL_RGB565 = 0x8D62;
    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;
    public static final int GL_PROGRAM_BINARY_LENGTH = 0x8741;
    public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE;
    public static final int GL_PROGRAM_BINARY_FORMATS = 0x87FF;
    public static final int GL_VERTEX_SHADER_BIT = 0x00000001;
    public static final int GL_FRAGMENT_SHADER_BIT = 0x00000002;
    public static final int GL_GEOMETRY_SHADER_BIT = 0x00000004;
    public static final int GL_TESS_CONTROL_SHADER_BIT = 0x00000008;
    public static final int GL_TESS_EVALUATION_SHADER_BIT = 0x00000010;
    public static final int GL_ALL_SHADER_BITS = 0xFFFFFFFF;
    public static final int GL_PROGRAM_SEPARABLE = 0x8258;
    public static final int GL_ACTIVE_PROGRAM = 0x8259;
    public static final int GL_PROGRAM_PIPELINE_BINDING = 0x825A;
    public static final int GL_MAX_VIEWPORTS = 0x825B;
    public static final int GL_VIEWPORT_SUBPIXEL_BITS = 0x825C;
    public static final int GL_VIEWPORT_BOUNDS_RANGE = 0x825D;
    public static final int GL_LAYER_PROVOKING_VERTEX = 0x825E;
    public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;
    public static final int GL_UNDEFINED_VERTEX = 0x8260;
    public static final int GL_VERSION_4_2 = 1;
    public static final int GL_COPY_READ_BUFFER_BINDING = 0x8F36;
    public static final int GL_COPY_WRITE_BUFFER_BINDING = 0x8F37;
    public static final int GL_TRANSFORM_FEEDBACK_ACTIVE = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_PAUSED = 0x8E23;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_WIDTH = 0x9127;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 0x9128;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_DEPTH = 0x9129;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_SIZE = 0x912A;
    public static final int GL_PACK_COMPRESSED_BLOCK_WIDTH = 0x912B;
    public static final int GL_PACK_COMPRESSED_BLOCK_HEIGHT = 0x912C;
    public static final int GL_PACK_COMPRESSED_BLOCK_DEPTH = 0x912D;
    public static final int GL_PACK_COMPRESSED_BLOCK_SIZE = 0x912E;
    public static final int GL_NUM_SAMPLE_COUNTS = 0x9380;
    public static final int GL_MIN_MAP_BUFFER_ALIGNMENT = 0x90BC;
    public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;
    public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;
    public static final int GL_ATOMIC_COUNTER_BUFFER_START = 0x92C2;
    public static final int GL_ATOMIC_COUNTER_BUFFER_SIZE = 0x92C3;
    public static final int GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE = 0x92C4;
    public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS = 0x92C5;
    public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES = 0x92C6;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER = 0x92C7;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER = 0x92C8;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER = 0x92CA;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER = 0x92CB;
    public static final int GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 0x92CC;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 0x92CD;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 0x92CF;
    public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 0x92D0;
    public static final int GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 0x92D1;
    public static final int GL_MAX_VERTEX_ATOMIC_COUNTERS = 0x92D2;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS = 0x92D3;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 0x92D4;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS = 0x92D5;
    public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTERS = 0x92D6;
    public static final int GL_MAX_COMBINED_ATOMIC_COUNTERS = 0x92D7;
    public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE = 0x92D8;
    public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 0x92DC;
    public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;
    public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;
    public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 0x00000001;
    public static final int GL_ELEMENT_ARRAY_BARRIER_BIT = 0x00000002;
    public static final int GL_UNIFORM_BARRIER_BIT = 0x00000004;
    public static final int GL_TEXTURE_FETCH_BARRIER_BIT = 0x00000008;
    public static final int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 0x00000020;
    public static final int GL_COMMAND_BARRIER_BIT = 0x00000040;
    public static final int GL_PIXEL_BUFFER_BARRIER_BIT = 0x00000080;
    public static final int GL_TEXTURE_UPDATE_BARRIER_BIT = 0x00000100;
    public static final int GL_BUFFER_UPDATE_BARRIER_BIT = 0x00000200;
    public static final int GL_FRAMEBUFFER_BARRIER_BIT = 0x00000400;
    public static final int GL_TRANSFORM_FEEDBACK_BARRIER_BIT = 0x00000800;
    public static final int GL_ATOMIC_COUNTER_BARRIER_BIT = 0x00001000;
    public static final int GL_ALL_BARRIER_BITS = 0xFFFFFFFF;
    public static final int GL_MAX_IMAGE_UNITS = 0x8F38;
    public static final int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 0x8F39;
    public static final int GL_IMAGE_BINDING_NAME = 0x8F3A;
    public static final int GL_IMAGE_BINDING_LEVEL = 0x8F3B;
    public static final int GL_IMAGE_BINDING_LAYERED = 0x8F3C;
    public static final int GL_IMAGE_BINDING_LAYER = 0x8F3D;
    public static final int GL_IMAGE_BINDING_ACCESS = 0x8F3E;
    public static final int GL_IMAGE_1D = 0x904C;
    public static final int GL_IMAGE_2D = 0x904D;
    public static final int GL_IMAGE_3D = 0x904E;
    public static final int GL_IMAGE_2D_RECT = 0x904F;
    public static final int GL_IMAGE_CUBE = 0x9050;
    public static final int GL_IMAGE_BUFFER = 0x9051;
    public static final int GL_IMAGE_1D_ARRAY = 0x9052;
    public static final int GL_IMAGE_2D_ARRAY = 0x9053;
    public static final int GL_IMAGE_CUBE_MAP_ARRAY = 0x9054;
    public static final int GL_IMAGE_2D_MULTISAMPLE = 0x9055;
    public static final int GL_IMAGE_2D_MULTISAMPLE_ARRAY = 0x9056;
    public static final int GL_INT_IMAGE_1D = 0x9057;
    public static final int GL_INT_IMAGE_2D = 0x9058;
    public static final int GL_INT_IMAGE_3D = 0x9059;
    public static final int GL_INT_IMAGE_2D_RECT = 0x905A;
    public static final int GL_INT_IMAGE_CUBE = 0x905B;
    public static final int GL_INT_IMAGE_BUFFER = 0x905C;
    public static final int GL_INT_IMAGE_1D_ARRAY = 0x905D;
    public static final int GL_INT_IMAGE_2D_ARRAY = 0x905E;
    public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY = 0x905F;
    public static final int GL_INT_IMAGE_2D_MULTISAMPLE = 0x9060;
    public static final int GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x9061;
    public static final int GL_UNSIGNED_INT_IMAGE_1D = 0x9062;
    public static final int GL_UNSIGNED_INT_IMAGE_2D = 0x9063;
    public static final int GL_UNSIGNED_INT_IMAGE_3D = 0x9064;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_RECT = 0x9065;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE = 0x9066;
    public static final int GL_UNSIGNED_INT_IMAGE_BUFFER = 0x9067;
    public static final int GL_UNSIGNED_INT_IMAGE_1D_ARRAY = 0x9068;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_ARRAY = 0x9069;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = 0x906A;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE = 0x906B;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x906C;
    public static final int GL_MAX_IMAGE_SAMPLES = 0x906D;
    public static final int GL_IMAGE_BINDING_FORMAT = 0x906E;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 0x90C7;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = 0x90C8;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 0x90C9;
    public static final int GL_MAX_VERTEX_IMAGE_UNIFORMS = 0x90CA;
    public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS = 0x90CB;
    public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS = 0x90CC;
    public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS = 0x90CD;
    public static final int GL_MAX_FRAGMENT_IMAGE_UNIFORMS = 0x90CE;
    public static final int GL_MAX_COMBINED_IMAGE_UNIFORMS = 0x90CF;
    public static final int GL_COMPRESSED_RGBA_BPTC_UNORM = 0x8E8C;
    public static final int GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM = 0x8E8D;
    public static final int GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT = 0x8E8E;
    public static final int GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 0x8E8F;
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;
    public static final int GL_VERSION_4_3 = 1;
    public static final int GL_NUM_SHADING_LANGUAGE_VERSIONS = 0x82E9;
    public static final int GL_VERTEX_ATTRIB_ARRAY_LONG = 0x874E;
    public static final int GL_COMPRESSED_RGB8_ETC2 = 0x9274;
    public static final int GL_COMPRESSED_SRGB8_ETC2 = 0x9275;
    public static final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;
    public static final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;
    public static final int GL_COMPRESSED_RGBA8_ETC2_EAC = 0x9278;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;
    public static final int GL_COMPRESSED_R11_EAC = 0x9270;
    public static final int GL_COMPRESSED_SIGNED_R11_EAC = 0x9271;
    public static final int GL_COMPRESSED_RG11_EAC = 0x9272;
    public static final int GL_COMPRESSED_SIGNED_RG11_EAC = 0x9273;
    public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;
    public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;
    public static final int GL_MAX_ELEMENT_INDEX = 0x8D6B;
    public static final int GL_COMPUTE_SHADER = 0x91B9;
    public static final int GL_MAX_COMPUTE_UNIFORM_BLOCKS = 0x91BB;
    public static final int GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 0x91BC;
    public static final int GL_MAX_COMPUTE_IMAGE_UNIFORMS = 0x91BD;
    public static final int GL_MAX_COMPUTE_SHARED_MEMORY_SIZE = 0x8262;
    public static final int GL_MAX_COMPUTE_UNIFORM_COMPONENTS = 0x8263;
    public static final int GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 0x8264;
    public static final int GL_MAX_COMPUTE_ATOMIC_COUNTERS = 0x8265;
    public static final int GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 0x90EB;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_SIZE = 0x91BF;
    public static final int GL_COMPUTE_WORK_GROUP_SIZE = 0x8267;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;
    public static final int GL_DISPATCH_INDIRECT_BUFFER = 0x90EE;
    public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;
    public static final int GL_COMPUTE_SHADER_BIT = 0x00000020;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;
    public static final int GL_DEBUG_SOURCE_API = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER = 0x8251;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW = 0x9148;
    public static final int GL_DEBUG_TYPE_MARKER = 0x8268;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP = 0x8269;
    public static final int GL_DEBUG_TYPE_POP_GROUP = 0x826A;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 0x826C;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH = 0x826D;
    public static final int GL_BUFFER = 0x82E0;
    public static final int GL_SHADER = 0x82E1;
    public static final int GL_PROGRAM = 0x82E2;
    public static final int GL_QUERY = 0x82E3;
    public static final int GL_PROGRAM_PIPELINE = 0x82E4;
    public static final int GL_SAMPLER = 0x82E6;
    public static final int GL_MAX_LABEL_LENGTH = 0x82E8;
    public static final int GL_DEBUG_OUTPUT = 0x92E0;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x00000002;
    public static final int GL_MAX_UNIFORM_LOCATIONS = 0x826E;
    public static final int GL_FRAMEBUFFER_DEFAULT_WIDTH = 0x9310;
    public static final int GL_FRAMEBUFFER_DEFAULT_HEIGHT = 0x9311;
    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS = 0x9312;
    public static final int GL_FRAMEBUFFER_DEFAULT_SAMPLES = 0x9313;
    public static final int GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;
    public static final int GL_MAX_FRAMEBUFFER_WIDTH = 0x9315;
    public static final int GL_MAX_FRAMEBUFFER_HEIGHT = 0x9316;
    public static final int GL_MAX_FRAMEBUFFER_LAYERS = 0x9317;
    public static final int GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;
    public static final int GL_INTERNALFORMAT_SUPPORTED = 0x826F;
    public static final int GL_INTERNALFORMAT_PREFERRED = 0x8270;
    public static final int GL_INTERNALFORMAT_RED_SIZE = 0x8271;
    public static final int GL_INTERNALFORMAT_GREEN_SIZE = 0x8272;
    public static final int GL_INTERNALFORMAT_BLUE_SIZE = 0x8273;
    public static final int GL_INTERNALFORMAT_ALPHA_SIZE = 0x8274;
    public static final int GL_INTERNALFORMAT_DEPTH_SIZE = 0x8275;
    public static final int GL_INTERNALFORMAT_STENCIL_SIZE = 0x8276;
    public static final int GL_INTERNALFORMAT_SHARED_SIZE = 0x8277;
    public static final int GL_INTERNALFORMAT_RED_TYPE = 0x8278;
    public static final int GL_INTERNALFORMAT_GREEN_TYPE = 0x8279;
    public static final int GL_INTERNALFORMAT_BLUE_TYPE = 0x827A;
    public static final int GL_INTERNALFORMAT_ALPHA_TYPE = 0x827B;
    public static final int GL_INTERNALFORMAT_DEPTH_TYPE = 0x827C;
    public static final int GL_INTERNALFORMAT_STENCIL_TYPE = 0x827D;
    public static final int GL_MAX_WIDTH = 0x827E;
    public static final int GL_MAX_HEIGHT = 0x827F;
    public static final int GL_MAX_DEPTH = 0x8280;
    public static final int GL_MAX_LAYERS = 0x8281;
    public static final int GL_MAX_COMBINED_DIMENSIONS = 0x8282;
    public static final int GL_COLOR_COMPONENTS = 0x8283;
    public static final int GL_DEPTH_COMPONENTS = 0x8284;
    public static final int GL_STENCIL_COMPONENTS = 0x8285;
    public static final int GL_COLOR_RENDERABLE = 0x8286;
    public static final int GL_DEPTH_RENDERABLE = 0x8287;
    public static final int GL_STENCIL_RENDERABLE = 0x8288;
    public static final int GL_FRAMEBUFFER_RENDERABLE = 0x8289;
    public static final int GL_FRAMEBUFFER_RENDERABLE_LAYERED = 0x828A;
    public static final int GL_FRAMEBUFFER_BLEND = 0x828B;
    public static final int GL_READ_PIXELS = 0x828C;
    public static final int GL_READ_PIXELS_FORMAT = 0x828D;
    public static final int GL_READ_PIXELS_TYPE = 0x828E;
    public static final int GL_TEXTURE_IMAGE_FORMAT = 0x828F;
    public static final int GL_TEXTURE_IMAGE_TYPE = 0x8290;
    public static final int GL_GET_TEXTURE_IMAGE_FORMAT = 0x8291;
    public static final int GL_GET_TEXTURE_IMAGE_TYPE = 0x8292;
    public static final int GL_MIPMAP = 0x8293;
    public static final int GL_MANUAL_GENERATE_MIPMAP = 0x8294;
    public static final int GL_AUTO_GENERATE_MIPMAP = 0x8295;
    public static final int GL_COLOR_ENCODING = 0x8296;
    public static final int GL_SRGB_READ = 0x8297;
    public static final int GL_SRGB_WRITE = 0x8298;
    public static final int GL_FILTER = 0x829A;
    public static final int GL_VERTEX_TEXTURE = 0x829B;
    public static final int GL_TESS_CONTROL_TEXTURE = 0x829C;
    public static final int GL_TESS_EVALUATION_TEXTURE = 0x829D;
    public static final int GL_GEOMETRY_TEXTURE = 0x829E;
    public static final int GL_FRAGMENT_TEXTURE = 0x829F;
    public static final int GL_COMPUTE_TEXTURE = 0x82A0;
    public static final int GL_TEXTURE_SHADOW = 0x82A1;
    public static final int GL_TEXTURE_GATHER = 0x82A2;
    public static final int GL_TEXTURE_GATHER_SHADOW = 0x82A3;
    public static final int GL_SHADER_IMAGE_LOAD = 0x82A4;
    public static final int GL_SHADER_IMAGE_STORE = 0x82A5;
    public static final int GL_SHADER_IMAGE_ATOMIC = 0x82A6;
    public static final int GL_IMAGE_TEXEL_SIZE = 0x82A7;
    public static final int GL_IMAGE_COMPATIBILITY_CLASS = 0x82A8;
    public static final int GL_IMAGE_PIXEL_FORMAT = 0x82A9;
    public static final int GL_IMAGE_PIXEL_TYPE = 0x82AA;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST = 0x82AC;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST = 0x82AD;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE = 0x82AE;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 0x82AF;
    public static final int GL_TEXTURE_COMPRESSED_BLOCK_WIDTH = 0x82B1;
    public static final int GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT = 0x82B2;
    public static final int GL_TEXTURE_COMPRESSED_BLOCK_SIZE = 0x82B3;
    public static final int GL_CLEAR_BUFFER = 0x82B4;
    public static final int GL_TEXTURE_VIEW = 0x82B5;
    public static final int GL_VIEW_COMPATIBILITY_CLASS = 0x82B6;
    public static final int GL_FULL_SUPPORT = 0x82B7;
    public static final int GL_CAVEAT_SUPPORT = 0x82B8;
    public static final int GL_IMAGE_CLASS_4_X_32 = 0x82B9;
    public static final int GL_IMAGE_CLASS_2_X_32 = 0x82BA;
    public static final int GL_IMAGE_CLASS_1_X_32 = 0x82BB;
    public static final int GL_IMAGE_CLASS_4_X_16 = 0x82BC;
    public static final int GL_IMAGE_CLASS_2_X_16 = 0x82BD;
    public static final int GL_IMAGE_CLASS_1_X_16 = 0x82BE;
    public static final int GL_IMAGE_CLASS_4_X_8 = 0x82BF;
    public static final int GL_IMAGE_CLASS_2_X_8 = 0x82C0;
    public static final int GL_IMAGE_CLASS_1_X_8 = 0x82C1;
    public static final int GL_IMAGE_CLASS_11_11_10 = 0x82C2;
    public static final int GL_IMAGE_CLASS_10_10_10_2 = 0x82C3;
    public static final int GL_VIEW_CLASS_128_BITS = 0x82C4;
    public static final int GL_VIEW_CLASS_96_BITS = 0x82C5;
    public static final int GL_VIEW_CLASS_64_BITS = 0x82C6;
    public static final int GL_VIEW_CLASS_48_BITS = 0x82C7;
    public static final int GL_VIEW_CLASS_32_BITS = 0x82C8;
    public static final int GL_VIEW_CLASS_24_BITS = 0x82C9;
    public static final int GL_VIEW_CLASS_16_BITS = 0x82CA;
    public static final int GL_VIEW_CLASS_8_BITS = 0x82CB;
    public static final int GL_VIEW_CLASS_S3TC_DXT1_RGB = 0x82CC;
    public static final int GL_VIEW_CLASS_S3TC_DXT1_RGBA = 0x82CD;
    public static final int GL_VIEW_CLASS_S3TC_DXT3_RGBA = 0x82CE;
    public static final int GL_VIEW_CLASS_S3TC_DXT5_RGBA = 0x82CF;
    public static final int GL_VIEW_CLASS_RGTC1_RED = 0x82D0;
    public static final int GL_VIEW_CLASS_RGTC2_RG = 0x82D1;
    public static final int GL_VIEW_CLASS_BPTC_UNORM = 0x82D2;
    public static final int GL_VIEW_CLASS_BPTC_FLOAT = 0x82D3;
    public static final int GL_UNIFORM = 0x92E1;
    public static final int GL_UNIFORM_BLOCK = 0x92E2;
    public static final int GL_PROGRAM_INPUT = 0x92E3;
    public static final int GL_PROGRAM_OUTPUT = 0x92E4;
    public static final int GL_BUFFER_VARIABLE = 0x92E5;
    public static final int GL_SHADER_STORAGE_BLOCK = 0x92E6;
    public static final int GL_VERTEX_SUBROUTINE = 0x92E8;
    public static final int GL_TESS_CONTROL_SUBROUTINE = 0x92E9;
    public static final int GL_TESS_EVALUATION_SUBROUTINE = 0x92EA;
    public static final int GL_GEOMETRY_SUBROUTINE = 0x92EB;
    public static final int GL_FRAGMENT_SUBROUTINE = 0x92EC;
    public static final int GL_COMPUTE_SUBROUTINE = 0x92ED;
    public static final int GL_VERTEX_SUBROUTINE_UNIFORM = 0x92EE;
    public static final int GL_TESS_CONTROL_SUBROUTINE_UNIFORM = 0x92EF;
    public static final int GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0;
    public static final int GL_GEOMETRY_SUBROUTINE_UNIFORM = 0x92F1;
    public static final int GL_FRAGMENT_SUBROUTINE_UNIFORM = 0x92F2;
    public static final int GL_COMPUTE_SUBROUTINE_UNIFORM = 0x92F3;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING = 0x92F4;
    public static final int GL_ACTIVE_RESOURCES = 0x92F5;
    public static final int GL_MAX_NAME_LENGTH = 0x92F6;
    public static final int GL_MAX_NUM_ACTIVE_VARIABLES = 0x92F7;
    public static final int GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;
    public static final int GL_NAME_LENGTH = 0x92F9;
    public static final int GL_TYPE = 0x92FA;
    public static final int GL_ARRAY_SIZE = 0x92FB;
    public static final int GL_OFFSET = 0x92FC;
    public static final int GL_BLOCK_INDEX = 0x92FD;
    public static final int GL_ARRAY_STRIDE = 0x92FE;
    public static final int GL_MATRIX_STRIDE = 0x92FF;
    public static final int GL_IS_ROW_MAJOR = 0x9300;
    public static final int GL_ATOMIC_COUNTER_BUFFER_INDEX = 0x9301;
    public static final int GL_BUFFER_BINDING = 0x9302;
    public static final int GL_BUFFER_DATA_SIZE = 0x9303;
    public static final int GL_NUM_ACTIVE_VARIABLES = 0x9304;
    public static final int GL_ACTIVE_VARIABLES = 0x9305;
    public static final int GL_REFERENCED_BY_VERTEX_SHADER = 0x9306;
    public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER = 0x9307;
    public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = 0x9309;
    public static final int GL_REFERENCED_BY_FRAGMENT_SHADER = 0x930A;
    public static final int GL_REFERENCED_BY_COMPUTE_SHADER = 0x930B;
    public static final int GL_TOP_LEVEL_ARRAY_SIZE = 0x930C;
    public static final int GL_TOP_LEVEL_ARRAY_STRIDE = 0x930D;
    public static final int GL_LOCATION = 0x930E;
    public static final int GL_LOCATION_INDEX = 0x930F;
    public static final int GL_IS_PER_PATCH = 0x92E7;
    public static final int GL_SHADER_STORAGE_BUFFER = 0x90D2;
    public static final int GL_SHADER_STORAGE_BUFFER_BINDING = 0x90D3;
    public static final int GL_SHADER_STORAGE_BUFFER_START = 0x90D4;
    public static final int GL_SHADER_STORAGE_BUFFER_SIZE = 0x90D5;
    public static final int GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS = 0x90D6;
    public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 0x90D7;
    public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 0x90D8;
    public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9;
    public static final int GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 0x90DA;
    public static final int GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 0x90DB;
    public static final int GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS = 0x90DC;
    public static final int GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS = 0x90DD;
    public static final int GL_MAX_SHADER_STORAGE_BLOCK_SIZE = 0x90DE;
    public static final int GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 0x90DF;
    public static final int GL_SHADER_STORAGE_BARRIER_BIT = 0x00002000;
    public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;
    public static final int GL_DEPTH_STENCIL_TEXTURE_MODE = 0x90EA;
    public static final int GL_TEXTURE_BUFFER_OFFSET = 0x919D;
    public static final int GL_TEXTURE_BUFFER_SIZE = 0x919E;
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;
    public static final int GL_TEXTURE_VIEW_MIN_LEVEL = 0x82DB;
    public static final int GL_TEXTURE_VIEW_NUM_LEVELS = 0x82DC;
    public static final int GL_TEXTURE_VIEW_MIN_LAYER = 0x82DD;
    public static final int GL_TEXTURE_VIEW_NUM_LAYERS = 0x82DE;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;
    public static final int GL_VERTEX_ATTRIB_BINDING = 0x82D4;
    public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;
    public static final int GL_VERTEX_BINDING_DIVISOR = 0x82D6;
    public static final int GL_VERTEX_BINDING_OFFSET = 0x82D7;
    public static final int GL_VERTEX_BINDING_STRIDE = 0x82D8;
    public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9;
    public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS = 0x82DA;
    public static final int GL_VERTEX_BINDING_BUFFER = 0x8F4F;
    public static final int GL_VERSION_4_4 = 1;
    public static final int GL_MAX_VERTEX_ATTRIB_STRIDE = 0x82E5;
    public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = 0x8221;
    public static final int GL_TEXTURE_BUFFER_BINDING = 0x8C2A;
    public static final int GL_MAP_PERSISTENT_BIT = 0x0040;
    public static final int GL_MAP_COHERENT_BIT = 0x0080;
    public static final int GL_DYNAMIC_STORAGE_BIT = 0x0100;
    public static final int GL_CLIENT_STORAGE_BIT = 0x0200;
    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x00004000;
    public static final int GL_BUFFER_IMMUTABLE_STORAGE = 0x821F;
    public static final int GL_BUFFER_STORAGE_FLAGS = 0x8220;
    public static final int GL_CLEAR_TEXTURE = 0x9365;
    public static final int GL_LOCATION_COMPONENT = 0x934A;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_INDEX = 0x934B;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_STRIDE = 0x934C;
    public static final int GL_QUERY_BUFFER = 0x9192;
    public static final int GL_QUERY_BUFFER_BARRIER_BIT = 0x00008000;
    public static final int GL_QUERY_BUFFER_BINDING = 0x9193;
    public static final int GL_QUERY_RESULT_NO_WAIT = 0x9194;
    public static final int GL_MIRROR_CLAMP_TO_EDGE = 0x8743;
    public static final int GL_VERSION_4_5 = 1;
    public static final int GL_CONTEXT_LOST = 0x0507;
    public static final int GL_NEGATIVE_ONE_TO_ONE = 0x935E;
    public static final int GL_ZERO_TO_ONE = 0x935F;
    public static final int GL_CLIP_ORIGIN = 0x935C;
    public static final int GL_CLIP_DEPTH_MODE = 0x935D;
    public static final int GL_QUERY_WAIT_INVERTED = 0x8E17;
    public static final int GL_QUERY_NO_WAIT_INVERTED = 0x8E18;
    public static final int GL_QUERY_BY_REGION_WAIT_INVERTED = 0x8E19;
    public static final int GL_QUERY_BY_REGION_NO_WAIT_INVERTED = 0x8E1A;
    public static final int GL_MAX_CULL_DISTANCES = 0x82F9;
    public static final int GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES = 0x82FA;
    public static final int GL_TEXTURE_TARGET = 0x1006;
    public static final int GL_QUERY_TARGET = 0x82EA;
    public static final int GL_GUILTY_CONTEXT_RESET = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY = 0x8256;
    public static final int GL_LOSE_CONTEXT_ON_RESET = 0x8252;
    public static final int GL_NO_RESET_NOTIFICATION = 0x8261;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT = 0x00000004;
    public static final int GL_CONTEXT_RELEASE_BEHAVIOR = 0x82FB;
    public static final int GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x82FC;
    public static final int GL_VERSION_4_6 = 1;
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V = 0x9551;
    public static final int GL_SPIR_V_BINARY = 0x9552;
    public static final int GL_PARAMETER_BUFFER = 0x80EE;
    public static final int GL_PARAMETER_BUFFER_BINDING = 0x80EF;
    public static final int GL_CONTEXT_FLAG_NO_ERROR_BIT = 0x00000008;
    public static final int GL_VERTICES_SUBMITTED = 0x82EE;
    public static final int GL_PRIMITIVES_SUBMITTED = 0x82EF;
    public static final int GL_VERTEX_SHADER_INVOCATIONS = 0x82F0;
    public static final int GL_TESS_CONTROL_SHADER_PATCHES = 0x82F1;
    public static final int GL_TESS_EVALUATION_SHADER_INVOCATIONS = 0x82F2;
    public static final int GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED = 0x82F3;
    public static final int GL_FRAGMENT_SHADER_INVOCATIONS = 0x82F4;
    public static final int GL_COMPUTE_SHADER_INVOCATIONS = 0x82F5;
    public static final int GL_CLIPPING_INPUT_PRIMITIVES = 0x82F6;
    public static final int GL_CLIPPING_OUTPUT_PRIMITIVES = 0x82F7;
    public static final int GL_POLYGON_OFFSET_CLAMP = 0x8E1B;
    public static final int GL_SPIR_V_EXTENSIONS = 0x9553;
    public static final int GL_NUM_SPIR_V_EXTENSIONS = 0x9554;
    public static final int GL_TEXTURE_MAX_ANISOTROPY = 0x84FE;
    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY = 0x84FF;
    public static final int GL_TRANSFORM_FEEDBACK_OVERFLOW = 0x82EC;
    public static final int GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW = 0x82ED;
    public static final int GL_ARB_ES2_compatibility = 1;
    public static final int GL_ARB_ES3_1_compatibility = 1;
    public static final int GL_ARB_ES3_2_compatibility = 1;
    public static final int GL_PRIMITIVE_BOUNDING_BOX_ARB = 0x92BE;
    public static final int GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB = 0x9381;
    public static final int GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB = 0x9382;
    public static final int GL_ARB_ES3_compatibility = 1;
    public static final int GL_ARB_arrays_of_arrays = 1;
    public static final int GL_ARB_base_instance = 1;
    public static final int GL_ARB_bindless_texture = 1;
    public static final int GL_UNSIGNED_INT64_ARB = 0x140F;
    public static final int GL_ARB_blend_func_extended = 1;
    public static final int GL_ARB_buffer_storage = 1;
    public static final int GL_ARB_cl_event = 1;
    public static final int GL_SYNC_CL_EVENT_ARB = 0x8240;
    public static final int GL_SYNC_CL_EVENT_COMPLETE_ARB = 0x8241;
    public static final int GL_ARB_clear_buffer_object = 1;
    public static final int GL_ARB_clear_texture = 1;
    public static final int GL_ARB_clip_control = 1;
    public static final int GL_ARB_compressed_texture_pixel_storage = 1;
    public static final int GL_ARB_compute_shader = 1;
    public static final int GL_ARB_compute_variable_group_size = 1;
    public static final int GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB = 0x9344;
    public static final int GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB = 0x90EB;
    public static final int GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB = 0x9345;
    public static final int GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB = 0x91BF;
    public static final int GL_ARB_conditional_render_inverted = 1;
    public static final int GL_ARB_conservative_depth = 1;
    public static final int GL_ARB_copy_buffer = 1;
    public static final int GL_ARB_copy_image = 1;
    public static final int GL_ARB_cull_distance = 1;
    public static final int GL_ARB_debug_output = 1;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION_ARB = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM_ARB = 0x8245;
    public static final int GL_DEBUG_SOURCE_API_ARB = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER_ARB = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY_ARB = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION_ARB = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER_ARB = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR_ARB = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY_ARB = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE_ARB = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER_ARB = 0x8251;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_ARB = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_ARB = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES_ARB = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH_ARB = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM_ARB = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW_ARB = 0x9148;
    public static final int GL_ARB_depth_buffer_float = 1;
    public static final int GL_ARB_depth_clamp = 1;
    public static final int GL_ARB_derivative_control = 1;
    public static final int GL_ARB_direct_state_access = 1;
    public static final int GL_ARB_draw_buffers_blend = 1;
    public static final int GL_ARB_draw_elements_base_vertex = 1;
    public static final int GL_ARB_draw_indirect = 1;
    public static final int GL_ARB_draw_instanced = 1;
    public static final int GL_ARB_enhanced_layouts = 1;
    public static final int GL_ARB_explicit_attrib_location = 1;
    public static final int GL_ARB_explicit_uniform_location = 1;
    public static final int GL_ARB_fragment_coord_conventions = 1;
    public static final int GL_ARB_fragment_layer_viewport = 1;
    public static final int GL_ARB_fragment_shader_interlock = 1;
    public static final int GL_ARB_framebuffer_no_attachments = 1;
    public static final int GL_ARB_framebuffer_object = 1;
    public static final int GL_ARB_framebuffer_sRGB = 1;
    public static final int GL_ARB_geometry_shader4 = 1;
    public static final int GL_LINES_ADJACENCY_ARB = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY_ARB = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY_ARB = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_ARB = 0x000D;
    public static final int GL_PROGRAM_POINT_SIZE_ARB = 0x8642;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB = 0x8C29;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB = 0x8DA7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB = 0x8DA8;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB = 0x8DA9;
    public static final int GL_GEOMETRY_SHADER_ARB = 0x8DD9;
    public static final int GL_GEOMETRY_VERTICES_OUT_ARB = 0x8DDA;
    public static final int GL_GEOMETRY_INPUT_TYPE_ARB = 0x8DDB;
    public static final int GL_GEOMETRY_OUTPUT_TYPE_ARB = 0x8DDC;
    public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB = 0x8DDD;
    public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_ARB = 0x8DDE;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB = 0x8DDF;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB = 0x8DE0;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB = 0x8DE1;
    public static final int GL_ARB_get_program_binary = 1;
    public static final int GL_ARB_get_texture_sub_image = 1;
    public static final int GL_ARB_gl_spirv = 1;
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V_ARB = 0x9551;
    public static final int GL_SPIR_V_BINARY_ARB = 0x9552;
    public static final int GL_ARB_gpu_shader5 = 1;
    public static final int GL_ARB_gpu_shader_fp64 = 1;
    public static final int GL_ARB_gpu_shader_int64 = 1;
    public static final int GL_INT64_ARB = 0x140E;
    public static final int GL_INT64_VEC2_ARB = 0x8FE9;
    public static final int GL_INT64_VEC3_ARB = 0x8FEA;
    public static final int GL_INT64_VEC4_ARB = 0x8FEB;
    public static final int GL_UNSIGNED_INT64_VEC2_ARB = 0x8FF5;
    public static final int GL_UNSIGNED_INT64_VEC3_ARB = 0x8FF6;
    public static final int GL_UNSIGNED_INT64_VEC4_ARB = 0x8FF7;
    public static final int GL_ARB_half_float_vertex = 1;
    public static final int GL_ARB_imaging = 1;
    public static final int GL_ARB_indirect_parameters = 1;
    public static final int GL_PARAMETER_BUFFER_ARB = 0x80EE;
    public static final int GL_PARAMETER_BUFFER_BINDING_ARB = 0x80EF;
    public static final int GL_ARB_instanced_arrays = 1;
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ARB = 0x88FE;
    public static final int GL_ARB_internalformat_query = 1;
    public static final int GL_ARB_internalformat_query2 = 1;
    public static final int GL_SRGB_DECODE_ARB = 0x8299;
    public static final int GL_VIEW_CLASS_EAC_R11 = 0x9383;
    public static final int GL_VIEW_CLASS_EAC_RG11 = 0x9384;
    public static final int GL_VIEW_CLASS_ETC2_RGB = 0x9385;
    public static final int GL_VIEW_CLASS_ETC2_RGBA = 0x9386;
    public static final int GL_VIEW_CLASS_ETC2_EAC_RGBA = 0x9387;
    public static final int GL_VIEW_CLASS_ASTC_4x4_RGBA = 0x9388;
    public static final int GL_VIEW_CLASS_ASTC_5x4_RGBA = 0x9389;
    public static final int GL_VIEW_CLASS_ASTC_5x5_RGBA = 0x938A;
    public static final int GL_VIEW_CLASS_ASTC_6x5_RGBA = 0x938B;
    public static final int GL_VIEW_CLASS_ASTC_6x6_RGBA = 0x938C;
    public static final int GL_VIEW_CLASS_ASTC_8x5_RGBA = 0x938D;
    public static final int GL_VIEW_CLASS_ASTC_8x6_RGBA = 0x938E;
    public static final int GL_VIEW_CLASS_ASTC_8x8_RGBA = 0x938F;
    public static final int GL_VIEW_CLASS_ASTC_10x5_RGBA = 0x9390;
    public static final int GL_VIEW_CLASS_ASTC_10x6_RGBA = 0x9391;
    public static final int GL_VIEW_CLASS_ASTC_10x8_RGBA = 0x9392;
    public static final int GL_VIEW_CLASS_ASTC_10x10_RGBA = 0x9393;
    public static final int GL_VIEW_CLASS_ASTC_12x10_RGBA = 0x9394;
    public static final int GL_VIEW_CLASS_ASTC_12x12_RGBA = 0x9395;
    public static final int GL_ARB_invalidate_subdata = 1;
    public static final int GL_ARB_map_buffer_alignment = 1;
    public static final int GL_ARB_map_buffer_range = 1;
    public static final int GL_ARB_multi_bind = 1;
    public static final int GL_ARB_multi_draw_indirect = 1;
    public static final int GL_ARB_occlusion_query2 = 1;
    public static final int GL_ARB_parallel_shader_compile = 1;
    public static final int GL_MAX_SHADER_COMPILER_THREADS_ARB = 0x91B0;
    public static final int GL_COMPLETION_STATUS_ARB = 0x91B1;
    public static final int GL_ARB_pipeline_statistics_query = 1;
    public static final int GL_VERTICES_SUBMITTED_ARB = 0x82EE;
    public static final int GL_PRIMITIVES_SUBMITTED_ARB = 0x82EF;
    public static final int GL_VERTEX_SHADER_INVOCATIONS_ARB = 0x82F0;
    public static final int GL_TESS_CONTROL_SHADER_PATCHES_ARB = 0x82F1;
    public static final int GL_TESS_EVALUATION_SHADER_INVOCATIONS_ARB = 0x82F2;
    public static final int GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED_ARB = 0x82F3;
    public static final int GL_FRAGMENT_SHADER_INVOCATIONS_ARB = 0x82F4;
    public static final int GL_COMPUTE_SHADER_INVOCATIONS_ARB = 0x82F5;
    public static final int GL_CLIPPING_INPUT_PRIMITIVES_ARB = 0x82F6;
    public static final int GL_CLIPPING_OUTPUT_PRIMITIVES_ARB = 0x82F7;
    public static final int GL_ARB_pixel_buffer_object = 1;
    public static final int GL_PIXEL_PACK_BUFFER_ARB = 0x88EB;
    public static final int GL_PIXEL_UNPACK_BUFFER_ARB = 0x88EC;
    public static final int GL_PIXEL_PACK_BUFFER_BINDING_ARB = 0x88ED;
    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING_ARB = 0x88EF;
    public static final int GL_ARB_polygon_offset_clamp = 1;
    public static final int GL_ARB_post_depth_coverage = 1;
    public static final int GL_ARB_program_interface_query = 1;
    public static final int GL_ARB_provoking_vertex = 1;
    public static final int GL_ARB_query_buffer_object = 1;
    public static final int GL_ARB_robust_buffer_access_behavior = 1;
    public static final int GL_ARB_robustness = 1;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x00000004;
    public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;
    public static final int GL_GUILTY_CONTEXT_RESET_ARB = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;
    public static final int GL_NO_RESET_NOTIFICATION_ARB = 0x8261;
    public static final int GL_ARB_robustness_isolation = 1;
    public static final int GL_ARB_sample_locations = 1;
    public static final int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB = 0x933D;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB = 0x933E;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB = 0x933F;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB = 0x9340;
    public static final int GL_SAMPLE_LOCATION_ARB = 0x8E50;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_ARB = 0x9341;
    public static final int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB = 0x9342;
    public static final int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB = 0x9343;
    public static final int GL_ARB_sample_shading = 1;
    public static final int GL_SAMPLE_SHADING_ARB = 0x8C36;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE_ARB = 0x8C37;
    public static final int GL_ARB_sampler_objects = 1;
    public static final int GL_ARB_seamless_cube_map = 1;
    public static final int GL_ARB_seamless_cubemap_per_texture = 1;
    public static final int GL_ARB_separate_shader_objects = 1;
    public static final int GL_ARB_shader_atomic_counter_ops = 1;
    public static final int GL_ARB_shader_atomic_counters = 1;
    public static final int GL_ARB_shader_ballot = 1;
    public static final int GL_ARB_shader_bit_encoding = 1;
    public static final int GL_ARB_shader_clock = 1;
    public static final int GL_ARB_shader_draw_parameters = 1;
    public static final int GL_ARB_shader_group_vote = 1;
    public static final int GL_ARB_shader_image_load_store = 1;
    public static final int GL_ARB_shader_image_size = 1;
    public static final int GL_ARB_shader_precision = 1;
    public static final int GL_ARB_shader_stencil_export = 1;
    public static final int GL_ARB_shader_storage_buffer_object = 1;
    public static final int GL_ARB_shader_subroutine = 1;
    public static final int GL_ARB_shader_texture_image_samples = 1;
    public static final int GL_ARB_shader_viewport_layer_array = 1;
    public static final int GL_ARB_shading_language_420pack = 1;
    public static final int GL_ARB_shading_language_include = 1;
    public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;
    public static final int GL_NAMED_STRING_LENGTH_ARB = 0x8DE9;
    public static final int GL_NAMED_STRING_TYPE_ARB = 0x8DEA;
    public static final int GL_ARB_shading_language_packing = 1;
    public static final int GL_ARB_sparse_buffer = 1;
    public static final int GL_SPARSE_STORAGE_BIT_ARB = 0x0400;
    public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 0x82F8;
    public static final int GL_ARB_sparse_texture = 1;
    public static final int GL_TEXTURE_SPARSE_ARB = 0x91A6;
    public static final int GL_VIRTUAL_PAGE_SIZE_INDEX_ARB = 0x91A7;
    public static final int GL_NUM_SPARSE_LEVELS_ARB = 0x91AA;
    public static final int GL_NUM_VIRTUAL_PAGE_SIZES_ARB = 0x91A8;
    public static final int GL_VIRTUAL_PAGE_SIZE_X_ARB = 0x9195;
    public static final int GL_VIRTUAL_PAGE_SIZE_Y_ARB = 0x9196;
    public static final int GL_VIRTUAL_PAGE_SIZE_Z_ARB = 0x9197;
    public static final int GL_MAX_SPARSE_TEXTURE_SIZE_ARB = 0x9198;
    public static final int GL_MAX_SPARSE_3D_TEXTURE_SIZE_ARB = 0x9199;
    public static final int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB = 0x919A;
    public static final int GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB = 0x91A9;
    public static final int GL_ARB_sparse_texture2 = 1;
    public static final int GL_ARB_sparse_texture_clamp = 1;
    public static final int GL_ARB_spirv_extensions = 1;
    public static final int GL_ARB_stencil_texturing = 1;
    public static final int GL_ARB_sync = 1;
    public static final int GL_ARB_tessellation_shader = 1;
    public static final int GL_ARB_texture_barrier = 1;
    public static final int GL_ARB_texture_border_clamp = 1;
    public static final int GL_CLAMP_TO_BORDER_ARB = 0x812D;
    public static final int GL_ARB_texture_buffer_object = 1;
    public static final int GL_TEXTURE_BUFFER_ARB = 0x8C2A;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_ARB = 0x8C2B;
    public static final int GL_TEXTURE_BINDING_BUFFER_ARB = 0x8C2C;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB = 0x8C2D;
    public static final int GL_TEXTURE_BUFFER_FORMAT_ARB = 0x8C2E;
    public static final int GL_ARB_texture_buffer_object_rgb32 = 1;
    public static final int GL_ARB_texture_buffer_range = 1;
    public static final int GL_ARB_texture_compression_bptc = 1;
    public static final int GL_COMPRESSED_RGBA_BPTC_UNORM_ARB = 0x8E8C;
    public static final int GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB = 0x8E8D;
    public static final int GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB = 0x8E8E;
    public static final int GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB = 0x8E8F;
    public static final int GL_ARB_texture_compression_rgtc = 1;
    public static final int GL_ARB_texture_cube_map_array = 1;
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY_ARB = 0x9009;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB = 0x900A;
    public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB = 0x900B;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY_ARB = 0x900C;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB = 0x900D;
    public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY_ARB = 0x900E;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB = 0x900F;
    public static final int GL_ARB_texture_filter_anisotropic = 1;
    public static final int GL_ARB_texture_filter_minmax = 1;
    public static final int GL_TEXTURE_REDUCTION_MODE_ARB = 0x9366;
    public static final int GL_WEIGHTED_AVERAGE_ARB = 0x9367;
    public static final int GL_ARB_texture_gather = 1;
    public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB = 0x8E5E;
    public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB = 0x8E5F;
    public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB = 0x8F9F;
    public static final int GL_ARB_texture_mirror_clamp_to_edge = 1;
    public static final int GL_ARB_texture_mirrored_repeat = 1;
    public static final int GL_MIRRORED_REPEAT_ARB = 0x8370;
    public static final int GL_ARB_texture_multisample = 1;
    public static final int GL_ARB_texture_non_power_of_two = 1;
    public static final int GL_ARB_texture_query_levels = 1;
    public static final int GL_ARB_texture_query_lod = 1;
    public static final int GL_ARB_texture_rg = 1;
    public static final int GL_ARB_texture_rgb10_a2ui = 1;
    public static final int GL_ARB_texture_stencil8 = 1;
    public static final int GL_ARB_texture_storage = 1;
    public static final int GL_ARB_texture_storage_multisample = 1;
    public static final int GL_ARB_texture_swizzle = 1;
    public static final int GL_ARB_texture_view = 1;
    public static final int GL_ARB_timer_query = 1;
    public static final int GL_ARB_transform_feedback2 = 1;
    public static final int GL_ARB_transform_feedback3 = 1;
    public static final int GL_ARB_transform_feedback_instanced = 1;
    public static final int GL_ARB_transform_feedback_overflow_query = 1;
    public static final int GL_TRANSFORM_FEEDBACK_OVERFLOW_ARB = 0x82EC;
    public static final int GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB = 0x82ED;
    public static final int GL_ARB_uniform_buffer_object = 1;
    public static final int GL_ARB_vertex_array_bgra = 1;
    public static final int GL_ARB_vertex_array_object = 1;
    public static final int GL_ARB_vertex_attrib_64bit = 1;
    public static final int GL_ARB_vertex_attrib_binding = 1;
    public static final int GL_ARB_vertex_type_10f_11f_11f_rev = 1;
    public static final int GL_ARB_vertex_type_2_10_10_10_rev = 1;
    public static final int GL_ARB_viewport_array = 1;
    public static final int GL_KHR_blend_equation_advanced = 1;
    public static final int GL_MULTIPLY_KHR = 0x9294;
    public static final int GL_SCREEN_KHR = 0x9295;
    public static final int GL_OVERLAY_KHR = 0x9296;
    public static final int GL_DARKEN_KHR = 0x9297;
    public static final int GL_LIGHTEN_KHR = 0x9298;
    public static final int GL_COLORDODGE_KHR = 0x9299;
    public static final int GL_COLORBURN_KHR = 0x929A;
    public static final int GL_HARDLIGHT_KHR = 0x929B;
    public static final int GL_SOFTLIGHT_KHR = 0x929C;
    public static final int GL_DIFFERENCE_KHR = 0x929E;
    public static final int GL_EXCLUSION_KHR = 0x92A0;
    public static final int GL_HSL_HUE_KHR = 0x92AD;
    public static final int GL_HSL_SATURATION_KHR = 0x92AE;
    public static final int GL_HSL_COLOR_KHR = 0x92AF;
    public static final int GL_HSL_LUMINOSITY_KHR = 0x92B0;
    public static final int GL_KHR_blend_equation_advanced_coherent = 1;
    public static final int GL_BLEND_ADVANCED_COHERENT_KHR = 0x9285;
    public static final int GL_KHR_context_flush_control = 1;
    public static final int GL_KHR_debug = 1;
    public static final int GL_KHR_no_error = 1;
    public static final int GL_CONTEXT_FLAG_NO_ERROR_BIT_KHR = 0x00000008;
    public static final int GL_KHR_parallel_shader_compile = 1;
    public static final int GL_MAX_SHADER_COMPILER_THREADS_KHR = 0x91B0;
    public static final int GL_COMPLETION_STATUS_KHR = 0x91B1;
    public static final int GL_KHR_robust_buffer_access_behavior = 1;
    public static final int GL_KHR_robustness = 1;
    public static final int GL_CONTEXT_ROBUST_ACCESS = 0x90F3;
    public static final int GL_KHR_shader_subgroup = 1;
    public static final int GL_SUBGROUP_SIZE_KHR = 0x9532;
    public static final int GL_SUBGROUP_SUPPORTED_STAGES_KHR = 0x9533;
    public static final int GL_SUBGROUP_SUPPORTED_FEATURES_KHR = 0x9534;
    public static final int GL_SUBGROUP_QUAD_ALL_STAGES_KHR = 0x9535;
    public static final int GL_SUBGROUP_FEATURE_BASIC_BIT_KHR = 0x00000001;
    public static final int GL_SUBGROUP_FEATURE_VOTE_BIT_KHR = 0x00000002;
    public static final int GL_SUBGROUP_FEATURE_ARITHMETIC_BIT_KHR = 0x00000004;
    public static final int GL_SUBGROUP_FEATURE_BALLOT_BIT_KHR = 0x00000008;
    public static final int GL_SUBGROUP_FEATURE_SHUFFLE_BIT_KHR = 0x00000010;
    public static final int GL_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT_KHR = 0x00000020;
    public static final int GL_SUBGROUP_FEATURE_CLUSTERED_BIT_KHR = 0x00000040;
    public static final int GL_SUBGROUP_FEATURE_QUAD_BIT_KHR = 0x00000080;
    public static final int GL_KHR_texture_compression_astc_hdr = 1;
    public static final int GL_COMPRESSED_RGBA_ASTC_4x4_KHR = 0x93B0;
    public static final int GL_COMPRESSED_RGBA_ASTC_5x4_KHR = 0x93B1;
    public static final int GL_COMPRESSED_RGBA_ASTC_5x5_KHR = 0x93B2;
    public static final int GL_COMPRESSED_RGBA_ASTC_6x5_KHR = 0x93B3;
    public static final int GL_COMPRESSED_RGBA_ASTC_6x6_KHR = 0x93B4;
    public static final int GL_COMPRESSED_RGBA_ASTC_8x5_KHR = 0x93B5;
    public static final int GL_COMPRESSED_RGBA_ASTC_8x6_KHR = 0x93B6;
    public static final int GL_COMPRESSED_RGBA_ASTC_8x8_KHR = 0x93B7;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x5_KHR = 0x93B8;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x6_KHR = 0x93B9;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x8_KHR = 0x93BA;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x10_KHR = 0x93BB;
    public static final int GL_COMPRESSED_RGBA_ASTC_12x10_KHR = 0x93BC;
    public static final int GL_COMPRESSED_RGBA_ASTC_12x12_KHR = 0x93BD;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR = 0x93D0;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR = 0x93D1;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR = 0x93D2;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR = 0x93D3;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR = 0x93D4;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR = 0x93D5;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR = 0x93D6;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR = 0x93D7;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR = 0x93D8;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR = 0x93D9;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR = 0x93DA;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR = 0x93DB;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR = 0x93DC;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR = 0x93DD;
    public static final int GL_KHR_texture_compression_astc_ldr = 1;
    public static final int GL_KHR_texture_compression_astc_sliced_3d = 1;
    public static final int GL_AMD_framebuffer_multisample_advanced = 1;
    public static final int GL_RENDERBUFFER_STORAGE_SAMPLES_AMD = 0x91B2;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD = 0x91B3;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD = 0x91B4;
    public static final int GL_MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD = 0x91B5;
    public static final int GL_NUM_SUPPORTED_MULTISAMPLE_MODES_AMD = 0x91B6;
    public static final int GL_SUPPORTED_MULTISAMPLE_MODES_AMD = 0x91B7;
    public static final int GL_AMD_performance_monitor = 1;
    public static final int GL_COUNTER_TYPE_AMD = 0x8BC0;
    public static final int GL_COUNTER_RANGE_AMD = 0x8BC1;
    public static final int GL_UNSIGNED_INT64_AMD = 0x8BC2;
    public static final int GL_PERCENTAGE_AMD = 0x8BC3;
    public static final int GL_PERFMON_RESULT_AVAILABLE_AMD = 0x8BC4;
    public static final int GL_PERFMON_RESULT_SIZE_AMD = 0x8BC5;
    public static final int GL_PERFMON_RESULT_AMD = 0x8BC6;
    public static final int GL_APPLE_rgb_422 = 1;
    public static final int GL_RGB_422_APPLE = 0x8A1F;
    public static final int GL_UNSIGNED_SHORT_8_8_APPLE = 0x85BA;
    public static final int GL_UNSIGNED_SHORT_8_8_REV_APPLE = 0x85BB;
    public static final int GL_RGB_RAW_422_APPLE = 0x8A51;
    public static final int GL_EXT_EGL_image_storage = 1;
    public static final int GL_EXT_EGL_sync = 1;
    public static final int GL_EXT_debug_label = 1;
    public static final int GL_PROGRAM_PIPELINE_OBJECT_EXT = 0x8A4F;
    public static final int GL_PROGRAM_OBJECT_EXT = 0x8B40;
    public static final int GL_SHADER_OBJECT_EXT = 0x8B48;
    public static final int GL_BUFFER_OBJECT_EXT = 0x9151;
    public static final int GL_QUERY_OBJECT_EXT = 0x9153;
    public static final int GL_VERTEX_ARRAY_OBJECT_EXT = 0x9154;
    public static final int GL_EXT_debug_marker = 1;
    public static final int GL_EXT_direct_state_access = 1;
    public static final int GL_PROGRAM_MATRIX_EXT = 0x8E2D;
    public static final int GL_TRANSPOSE_PROGRAM_MATRIX_EXT = 0x8E2E;
    public static final int GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 0x8E2F;
    public static final int GL_EXT_draw_instanced = 1;
    public static final int GL_EXT_multiview_tessellation_geometry_shader = 1;
    public static final int GL_EXT_multiview_texture_multisample = 1;
    public static final int GL_EXT_multiview_timer_query = 1;
    public static final int GL_EXT_polygon_offset_clamp = 1;
    public static final int GL_POLYGON_OFFSET_CLAMP_EXT = 0x8E1B;
    public static final int GL_EXT_post_depth_coverage = 1;
    public static final int GL_EXT_raster_multisample = 1;
    public static final int GL_RASTER_MULTISAMPLE_EXT = 0x9327;
    public static final int GL_RASTER_SAMPLES_EXT = 0x9328;
    public static final int GL_MAX_RASTER_SAMPLES_EXT = 0x9329;
    public static final int GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT = 0x932A;
    public static final int GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B;
    public static final int GL_EFFECTIVE_RASTER_SAMPLES_EXT = 0x932C;
    public static final int GL_EXT_separate_shader_objects = 1;
    public static final int GL_ACTIVE_PROGRAM_EXT = 0x8B8D;
    public static final int GL_EXT_shader_framebuffer_fetch = 1;
    public static final int GL_FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT = 0x8A52;
    public static final int GL_EXT_shader_framebuffer_fetch_non_coherent = 1;
    public static final int GL_EXT_shader_integer_mix = 1;
    public static final int GL_EXT_texture_compression_s3tc = 1;
    public static final int GL_COMPRESSED_RGB_S3TC_DXT1_EXT = 0x83F0;
    public static final int GL_COMPRESSED_RGBA_S3TC_DXT1_EXT = 0x83F1;
    public static final int GL_COMPRESSED_RGBA_S3TC_DXT3_EXT = 0x83F2;
    public static final int GL_COMPRESSED_RGBA_S3TC_DXT5_EXT = 0x83F3;
    public static final int GL_EXT_texture_filter_minmax = 1;
    public static final int GL_TEXTURE_REDUCTION_MODE_EXT = 0x9366;
    public static final int GL_WEIGHTED_AVERAGE_EXT = 0x9367;
    public static final int GL_EXT_texture_sRGB_R8 = 1;
    public static final int GL_SR8_EXT = 0x8FBD;
    public static final int GL_EXT_texture_sRGB_RG8 = 1;
    public static final int GL_SRG8_EXT = 0x8FBE;
    public static final int GL_EXT_texture_sRGB_decode = 1;
    public static final int GL_TEXTURE_SRGB_DECODE_EXT = 0x8A48;
    public static final int GL_DECODE_EXT = 0x8A49;
    public static final int GL_SKIP_DECODE_EXT = 0x8A4A;
    public static final int GL_EXT_texture_shadow_lod = 1;
    public static final int GL_EXT_texture_storage = 1;
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT_EXT = 0x912F;
    public static final int GL_ALPHA8_EXT = 0x803C;
    public static final int GL_LUMINANCE8_EXT = 0x8040;
    public static final int GL_LUMINANCE8_ALPHA8_EXT = 0x8045;
    public static final int GL_RGBA32F_EXT = 0x8814;
    public static final int GL_RGB32F_EXT = 0x8815;
    public static final int GL_ALPHA32F_EXT = 0x8816;
    public static final int GL_LUMINANCE32F_EXT = 0x8818;
    public static final int GL_LUMINANCE_ALPHA32F_EXT = 0x8819;
    public static final int GL_RGBA16F_EXT = 0x881A;
    public static final int GL_RGB16F_EXT = 0x881B;
    public static final int GL_ALPHA16F_EXT = 0x881C;
    public static final int GL_LUMINANCE16F_EXT = 0x881E;
    public static final int GL_LUMINANCE_ALPHA16F_EXT = 0x881F;
    public static final int GL_RGB10_A2_EXT = 0x8059;
    public static final int GL_RGB10_EXT = 0x8052;
    public static final int GL_BGRA8_EXT = 0x93A1;
    public static final int GL_R8_EXT = 0x8229;
    public static final int GL_RG8_EXT = 0x822B;
    public static final int GL_R32F_EXT = 0x822E;
    public static final int GL_RG32F_EXT = 0x8230;
    public static final int GL_R16F_EXT = 0x822D;
    public static final int GL_RG16F_EXT = 0x822F;
    public static final int GL_EXT_window_rectangles = 1;
    public static final int GL_INCLUSIVE_EXT = 0x8F10;
    public static final int GL_EXCLUSIVE_EXT = 0x8F11;
    public static final int GL_WINDOW_RECTANGLE_EXT = 0x8F12;
    public static final int GL_WINDOW_RECTANGLE_MODE_EXT = 0x8F13;
    public static final int GL_MAX_WINDOW_RECTANGLES_EXT = 0x8F14;
    public static final int GL_NUM_WINDOW_RECTANGLES_EXT = 0x8F15;
    public static final int GL_INTEL_blackhole_render = 1;
    public static final int GL_BLACKHOLE_RENDER_INTEL = 0x83FC;
    public static final int GL_INTEL_conservative_rasterization = 1;
    public static final int GL_CONSERVATIVE_RASTERIZATION_INTEL = 0x83FE;
    public static final int GL_INTEL_framebuffer_CMAA = 1;
    public static final int GL_INTEL_performance_query = 1;
    public static final int GL_PERFQUERY_SINGLE_CONTEXT_INTEL = 0x00000000;
    public static final int GL_PERFQUERY_GLOBAL_CONTEXT_INTEL = 0x00000001;
    public static final int GL_PERFQUERY_WAIT_INTEL = 0x83FB;
    public static final int GL_PERFQUERY_FLUSH_INTEL = 0x83FA;
    public static final int GL_PERFQUERY_DONOT_FLUSH_INTEL = 0x83F9;
    public static final int GL_PERFQUERY_COUNTER_EVENT_INTEL = 0x94F0;
    public static final int GL_PERFQUERY_COUNTER_DURATION_NORM_INTEL = 0x94F1;
    public static final int GL_PERFQUERY_COUNTER_DURATION_RAW_INTEL = 0x94F2;
    public static final int GL_PERFQUERY_COUNTER_THROUGHPUT_INTEL = 0x94F3;
    public static final int GL_PERFQUERY_COUNTER_RAW_INTEL = 0x94F4;
    public static final int GL_PERFQUERY_COUNTER_TIMESTAMP_INTEL = 0x94F5;
    public static final int GL_PERFQUERY_COUNTER_DATA_UINT32_INTEL = 0x94F8;
    public static final int GL_PERFQUERY_COUNTER_DATA_UINT64_INTEL = 0x94F9;
    public static final int GL_PERFQUERY_COUNTER_DATA_FLOAT_INTEL = 0x94FA;
    public static final int GL_PERFQUERY_COUNTER_DATA_DOUBLE_INTEL = 0x94FB;
    public static final int GL_PERFQUERY_COUNTER_DATA_BOOL32_INTEL = 0x94FC;
    public static final int GL_PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL = 0x94FD;
    public static final int GL_PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL = 0x94FE;
    public static final int GL_PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL = 0x94FF;
    public static final int GL_PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL = 0x9500;
    public static final int GL_MESA_framebuffer_flip_x = 1;
    public static final int GL_FRAMEBUFFER_FLIP_X_MESA = 0x8BBC;
    public static final int GL_MESA_framebuffer_flip_y = 1;
    public static final int GL_FRAMEBUFFER_FLIP_Y_MESA = 0x8BBB;
    public static final int GL_MESA_framebuffer_swap_xy = 1;
    public static final int GL_FRAMEBUFFER_SWAP_XY_MESA = 0x8BBD;
    public static final int GL_NV_bindless_multi_draw_indirect = 1;
    public static final int GL_NV_bindless_multi_draw_indirect_count = 1;
    public static final int GL_NV_bindless_texture = 1;
    public static final int GL_NV_blend_equation_advanced = 1;
    public static final int GL_BLEND_OVERLAP_NV = 0x9281;
    public static final int GL_BLEND_PREMULTIPLIED_SRC_NV = 0x9280;
    public static final int GL_BLUE_NV = 0x1905;
    public static final int GL_COLORBURN_NV = 0x929A;
    public static final int GL_COLORDODGE_NV = 0x9299;
    public static final int GL_CONJOINT_NV = 0x9284;
    public static final int GL_CONTRAST_NV = 0x92A1;
    public static final int GL_DARKEN_NV = 0x9297;
    public static final int GL_DIFFERENCE_NV = 0x929E;
    public static final int GL_DISJOINT_NV = 0x9283;
    public static final int GL_DST_ATOP_NV = 0x928F;
    public static final int GL_DST_IN_NV = 0x928B;
    public static final int GL_DST_NV = 0x9287;
    public static final int GL_DST_OUT_NV = 0x928D;
    public static final int GL_DST_OVER_NV = 0x9289;
    public static final int GL_EXCLUSION_NV = 0x92A0;
    public static final int GL_GREEN_NV = 0x1904;
    public static final int GL_HARDLIGHT_NV = 0x929B;
    public static final int GL_HARDMIX_NV = 0x92A9;
    public static final int GL_HSL_COLOR_NV = 0x92AF;
    public static final int GL_HSL_HUE_NV = 0x92AD;
    public static final int GL_HSL_LUMINOSITY_NV = 0x92B0;
    public static final int GL_HSL_SATURATION_NV = 0x92AE;
    public static final int GL_INVERT_OVG_NV = 0x92B4;
    public static final int GL_INVERT_RGB_NV = 0x92A3;
    public static final int GL_LIGHTEN_NV = 0x9298;
    public static final int GL_LINEARBURN_NV = 0x92A5;
    public static final int GL_LINEARDODGE_NV = 0x92A4;
    public static final int GL_LINEARLIGHT_NV = 0x92A7;
    public static final int GL_MINUS_CLAMPED_NV = 0x92B3;
    public static final int GL_MINUS_NV = 0x929F;
    public static final int GL_MULTIPLY_NV = 0x9294;
    public static final int GL_OVERLAY_NV = 0x9296;
    public static final int GL_PINLIGHT_NV = 0x92A8;
    public static final int GL_PLUS_CLAMPED_ALPHA_NV = 0x92B2;
    public static final int GL_PLUS_CLAMPED_NV = 0x92B1;
    public static final int GL_PLUS_DARKER_NV = 0x9292;
    public static final int GL_PLUS_NV = 0x9291;
    public static final int GL_RED_NV = 0x1903;
    public static final int GL_SCREEN_NV = 0x9295;
    public static final int GL_SOFTLIGHT_NV = 0x929C;
    public static final int GL_SRC_ATOP_NV = 0x928E;
    public static final int GL_SRC_IN_NV = 0x928A;
    public static final int GL_SRC_NV = 0x9286;
    public static final int GL_SRC_OUT_NV = 0x928C;
    public static final int GL_SRC_OVER_NV = 0x9288;
    public static final int GL_UNCORRELATED_NV = 0x9282;
    public static final int GL_VIVIDLIGHT_NV = 0x92A6;
    public static final int GL_XOR_NV = 0x1506;
    public static final int GL_NV_blend_equation_advanced_coherent = 1;
    public static final int GL_BLEND_ADVANCED_COHERENT_NV = 0x9285;
    public static final int GL_NV_blend_minmax_factor = 1;
    public static final int GL_FACTOR_MIN_AMD = 0x901C;
    public static final int GL_FACTOR_MAX_AMD = 0x901D;
    public static final int GL_NV_clip_space_w_scaling = 1;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_NV = 0x937C;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_X_COEFF_NV = 0x937D;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF_NV = 0x937E;
    public static final int GL_NV_command_list = 1;
    public static final int GL_TERMINATE_SEQUENCE_COMMAND_NV = 0x0000;
    public static final int GL_NOP_COMMAND_NV = 0x0001;
    public static final int GL_DRAW_ELEMENTS_COMMAND_NV = 0x0002;
    public static final int GL_DRAW_ARRAYS_COMMAND_NV = 0x0003;
    public static final int GL_DRAW_ELEMENTS_STRIP_COMMAND_NV = 0x0004;
    public static final int GL_DRAW_ARRAYS_STRIP_COMMAND_NV = 0x0005;
    public static final int GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 0x0006;
    public static final int GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV = 0x0007;
    public static final int GL_ELEMENT_ADDRESS_COMMAND_NV = 0x0008;
    public static final int GL_ATTRIBUTE_ADDRESS_COMMAND_NV = 0x0009;
    public static final int GL_UNIFORM_ADDRESS_COMMAND_NV = 0x000A;
    public static final int GL_BLEND_COLOR_COMMAND_NV = 0x000B;
    public static final int GL_STENCIL_REF_COMMAND_NV = 0x000C;
    public static final int GL_LINE_WIDTH_COMMAND_NV = 0x000D;
    public static final int GL_POLYGON_OFFSET_COMMAND_NV = 0x000E;
    public static final int GL_ALPHA_REF_COMMAND_NV = 0x000F;
    public static final int GL_VIEWPORT_COMMAND_NV = 0x0010;
    public static final int GL_SCISSOR_COMMAND_NV = 0x0011;
    public static final int GL_FRONT_FACE_COMMAND_NV = 0x0012;
    public static final int GL_NV_compute_shader_derivatives = 1;
    public static final int GL_NV_conditional_render = 1;
    public static final int GL_QUERY_WAIT_NV = 0x8E13;
    public static final int GL_QUERY_NO_WAIT_NV = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT_NV = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;
    public static final int GL_NV_conservative_raster = 1;
    public static final int GL_CONSERVATIVE_RASTERIZATION_NV = 0x9346;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV = 0x9347;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV = 0x9348;
    public static final int GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV = 0x9349;
    public static final int GL_NV_conservative_raster_dilate = 1;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_NV = 0x9379;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV = 0x937A;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV = 0x937B;
    public static final int GL_NV_conservative_raster_pre_snap = 1;
    public static final int GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_NV = 0x9550;
    public static final int GL_NV_conservative_raster_pre_snap_triangles = 1;
    public static final int GL_CONSERVATIVE_RASTER_MODE_NV = 0x954D;
    public static final int GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV = 0x954E;
    public static final int GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV = 0x954F;
    public static final int GL_NV_conservative_raster_underestimation = 1;
    public static final int GL_NV_depth_buffer_float = 1;
    public static final int GL_DEPTH_COMPONENT32F_NV = 0x8DAB;
    public static final int GL_DEPTH32F_STENCIL8_NV = 0x8DAC;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 0x8DAD;
    public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 0x8DAF;
    public static final int GL_NV_draw_vulkan_image = 1;
    public static final int GL_NV_fill_rectangle = 1;
    public static final int GL_FILL_RECTANGLE_NV = 0x933C;
    public static final int GL_NV_fragment_coverage_to_color = 1;
    public static final int GL_FRAGMENT_COVERAGE_TO_COLOR_NV = 0x92DD;
    public static final int GL_FRAGMENT_COVERAGE_COLOR_NV = 0x92DE;
    public static final int GL_NV_fragment_shader_barycentric = 1;
    public static final int GL_NV_fragment_shader_interlock = 1;
    public static final int GL_NV_framebuffer_mixed_samples = 1;
    public static final int GL_COVERAGE_MODULATION_TABLE_NV = 0x9331;
    public static final int GL_COLOR_SAMPLES_NV = 0x8E20;
    public static final int GL_DEPTH_SAMPLES_NV = 0x932D;
    public static final int GL_STENCIL_SAMPLES_NV = 0x932E;
    public static final int GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV = 0x932F;
    public static final int GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV = 0x9330;
    public static final int GL_COVERAGE_MODULATION_NV = 0x9332;
    public static final int GL_COVERAGE_MODULATION_TABLE_SIZE_NV = 0x9333;
    public static final int GL_NV_framebuffer_multisample_coverage = 1;
    public static final int GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 0x8CAB;
    public static final int GL_RENDERBUFFER_COLOR_SAMPLES_NV = 0x8E10;
    public static final int GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E11;
    public static final int GL_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E12;
    public static final int GL_NV_geometry_shader_passthrough = 1;
    public static final int GL_NV_gpu_shader5 = 1;
    public static final int GL_INT64_NV = 0x140E;
    public static final int GL_UNSIGNED_INT64_NV = 0x140F;
    public static final int GL_INT8_NV = 0x8FE0;
    public static final int GL_INT8_VEC2_NV = 0x8FE1;
    public static final int GL_INT8_VEC3_NV = 0x8FE2;
    public static final int GL_INT8_VEC4_NV = 0x8FE3;
    public static final int GL_INT16_NV = 0x8FE4;
    public static final int GL_INT16_VEC2_NV = 0x8FE5;
    public static final int GL_INT16_VEC3_NV = 0x8FE6;
    public static final int GL_INT16_VEC4_NV = 0x8FE7;
    public static final int GL_INT64_VEC2_NV = 0x8FE9;
    public static final int GL_INT64_VEC3_NV = 0x8FEA;
    public static final int GL_INT64_VEC4_NV = 0x8FEB;
    public static final int GL_UNSIGNED_INT8_NV = 0x8FEC;
    public static final int GL_UNSIGNED_INT8_VEC2_NV = 0x8FED;
    public static final int GL_UNSIGNED_INT8_VEC3_NV = 0x8FEE;
    public static final int GL_UNSIGNED_INT8_VEC4_NV = 0x8FEF;
    public static final int GL_UNSIGNED_INT16_NV = 0x8FF0;
    public static final int GL_UNSIGNED_INT16_VEC2_NV = 0x8FF1;
    public static final int GL_UNSIGNED_INT16_VEC3_NV = 0x8FF2;
    public static final int GL_UNSIGNED_INT16_VEC4_NV = 0x8FF3;
    public static final int GL_UNSIGNED_INT64_VEC2_NV = 0x8FF5;
    public static final int GL_UNSIGNED_INT64_VEC3_NV = 0x8FF6;
    public static final int GL_UNSIGNED_INT64_VEC4_NV = 0x8FF7;
    public static final int GL_FLOAT16_NV = 0x8FF8;
    public static final int GL_FLOAT16_VEC2_NV = 0x8FF9;
    public static final int GL_FLOAT16_VEC3_NV = 0x8FFA;
    public static final int GL_FLOAT16_VEC4_NV = 0x8FFB;
    public static final int GL_NV_internalformat_sample_query = 1;
    public static final int GL_MULTISAMPLES_NV = 0x9371;
    public static final int GL_SUPERSAMPLE_SCALE_X_NV = 0x9372;
    public static final int GL_SUPERSAMPLE_SCALE_Y_NV = 0x9373;
    public static final int GL_CONFORMANT_NV = 0x9374;
    public static final int GL_NV_memory_attachment = 1;
    public static final int GL_ATTACHED_MEMORY_OBJECT_NV = 0x95A4;
    public static final int GL_ATTACHED_MEMORY_OFFSET_NV = 0x95A5;
    public static final int GL_MEMORY_ATTACHABLE_ALIGNMENT_NV = 0x95A6;
    public static final int GL_MEMORY_ATTACHABLE_SIZE_NV = 0x95A7;
    public static final int GL_MEMORY_ATTACHABLE_NV = 0x95A8;
    public static final int GL_DETACHED_MEMORY_INCARNATION_NV = 0x95A9;
    public static final int GL_DETACHED_TEXTURES_NV = 0x95AA;
    public static final int GL_DETACHED_BUFFERS_NV = 0x95AB;
    public static final int GL_MAX_DETACHED_TEXTURES_NV = 0x95AC;
    public static final int GL_MAX_DETACHED_BUFFERS_NV = 0x95AD;
    public static final int GL_NV_memory_object_sparse = 1;
    public static final int GL_NV_mesh_shader = 1;
    public static final int GL_MESH_SHADER_NV = 0x9559;
    public static final int GL_TASK_SHADER_NV = 0x955A;
    public static final int GL_MAX_MESH_UNIFORM_BLOCKS_NV = 0x8E60;
    public static final int GL_MAX_MESH_TEXTURE_IMAGE_UNITS_NV = 0x8E61;
    public static final int GL_MAX_MESH_IMAGE_UNIFORMS_NV = 0x8E62;
    public static final int GL_MAX_MESH_UNIFORM_COMPONENTS_NV = 0x8E63;
    public static final int GL_MAX_MESH_ATOMIC_COUNTER_BUFFERS_NV = 0x8E64;
    public static final int GL_MAX_MESH_ATOMIC_COUNTERS_NV = 0x8E65;
    public static final int GL_MAX_MESH_SHADER_STORAGE_BLOCKS_NV = 0x8E66;
    public static final int GL_MAX_COMBINED_MESH_UNIFORM_COMPONENTS_NV = 0x8E67;
    public static final int GL_MAX_TASK_UNIFORM_BLOCKS_NV = 0x8E68;
    public static final int GL_MAX_TASK_TEXTURE_IMAGE_UNITS_NV = 0x8E69;
    public static final int GL_MAX_TASK_IMAGE_UNIFORMS_NV = 0x8E6A;
    public static final int GL_MAX_TASK_UNIFORM_COMPONENTS_NV = 0x8E6B;
    public static final int GL_MAX_TASK_ATOMIC_COUNTER_BUFFERS_NV = 0x8E6C;
    public static final int GL_MAX_TASK_ATOMIC_COUNTERS_NV = 0x8E6D;
    public static final int GL_MAX_TASK_SHADER_STORAGE_BLOCKS_NV = 0x8E6E;
    public static final int GL_MAX_COMBINED_TASK_UNIFORM_COMPONENTS_NV = 0x8E6F;
    public static final int GL_MAX_MESH_WORK_GROUP_INVOCATIONS_NV = 0x95A2;
    public static final int GL_MAX_TASK_WORK_GROUP_INVOCATIONS_NV = 0x95A3;
    public static final int GL_MAX_MESH_TOTAL_MEMORY_SIZE_NV = 0x9536;
    public static final int GL_MAX_TASK_TOTAL_MEMORY_SIZE_NV = 0x9537;
    public static final int GL_MAX_MESH_OUTPUT_VERTICES_NV = 0x9538;
    public static final int GL_MAX_MESH_OUTPUT_PRIMITIVES_NV = 0x9539;
    public static final int GL_MAX_TASK_OUTPUT_COUNT_NV = 0x953A;
    public static final int GL_MAX_DRAW_MESH_TASKS_COUNT_NV = 0x953D;
    public static final int GL_MAX_MESH_VIEWS_NV = 0x9557;
    public static final int GL_MESH_OUTPUT_PER_VERTEX_GRANULARITY_NV = 0x92DF;
    public static final int GL_MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_NV = 0x9543;
    public static final int GL_MAX_MESH_WORK_GROUP_SIZE_NV = 0x953B;
    public static final int GL_MAX_TASK_WORK_GROUP_SIZE_NV = 0x953C;
    public static final int GL_MESH_WORK_GROUP_SIZE_NV = 0x953E;
    public static final int GL_TASK_WORK_GROUP_SIZE_NV = 0x953F;
    public static final int GL_MESH_VERTICES_OUT_NV = 0x9579;
    public static final int GL_MESH_PRIMITIVES_OUT_NV = 0x957A;
    public static final int GL_MESH_OUTPUT_TYPE_NV = 0x957B;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV = 0x959C;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_NV = 0x959D;
    public static final int GL_REFERENCED_BY_MESH_SHADER_NV = 0x95A0;
    public static final int GL_REFERENCED_BY_TASK_SHADER_NV = 0x95A1;
    public static final int GL_MESH_SHADER_BIT_NV = 0x00000040;
    public static final int GL_TASK_SHADER_BIT_NV = 0x00000080;
    public static final int GL_MESH_SUBROUTINE_NV = 0x957C;
    public static final int GL_TASK_SUBROUTINE_NV = 0x957D;
    public static final int GL_MESH_SUBROUTINE_UNIFORM_NV = 0x957E;
    public static final int GL_TASK_SUBROUTINE_UNIFORM_NV = 0x957F;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_MESH_SHADER_NV = 0x959E;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TASK_SHADER_NV = 0x959F;
    public static final int GL_NV_path_rendering = 1;
    public static final int GL_PATH_FORMAT_SVG_NV = 0x9070;
    public static final int GL_PATH_FORMAT_PS_NV = 0x9071;
    public static final int GL_STANDARD_FONT_NAME_NV = 0x9072;
    public static final int GL_SYSTEM_FONT_NAME_NV = 0x9073;
    public static final int GL_FILE_NAME_NV = 0x9074;
    public static final int GL_PATH_STROKE_WIDTH_NV = 0x9075;
    public static final int GL_PATH_END_CAPS_NV = 0x9076;
    public static final int GL_PATH_INITIAL_END_CAP_NV = 0x9077;
    public static final int GL_PATH_TERMINAL_END_CAP_NV = 0x9078;
    public static final int GL_PATH_JOIN_STYLE_NV = 0x9079;
    public static final int GL_PATH_MITER_LIMIT_NV = 0x907A;
    public static final int GL_PATH_DASH_CAPS_NV = 0x907B;
    public static final int GL_PATH_INITIAL_DASH_CAP_NV = 0x907C;
    public static final int GL_PATH_TERMINAL_DASH_CAP_NV = 0x907D;
    public static final int GL_PATH_DASH_OFFSET_NV = 0x907E;
    public static final int GL_PATH_CLIENT_LENGTH_NV = 0x907F;
    public static final int GL_PATH_FILL_MODE_NV = 0x9080;
    public static final int GL_PATH_FILL_MASK_NV = 0x9081;
    public static final int GL_PATH_FILL_COVER_MODE_NV = 0x9082;
    public static final int GL_PATH_STROKE_COVER_MODE_NV = 0x9083;
    public static final int GL_PATH_STROKE_MASK_NV = 0x9084;
    public static final int GL_COUNT_UP_NV = 0x9088;
    public static final int GL_COUNT_DOWN_NV = 0x9089;
    public static final int GL_PATH_OBJECT_BOUNDING_BOX_NV = 0x908A;
    public static final int GL_CONVEX_HULL_NV = 0x908B;
    public static final int GL_BOUNDING_BOX_NV = 0x908D;
    public static final int GL_TRANSLATE_X_NV = 0x908E;
    public static final int GL_TRANSLATE_Y_NV = 0x908F;
    public static final int GL_TRANSLATE_2D_NV = 0x9090;
    public static final int GL_TRANSLATE_3D_NV = 0x9091;
    public static final int GL_AFFINE_2D_NV = 0x9092;
    public static final int GL_AFFINE_3D_NV = 0x9094;
    public static final int GL_TRANSPOSE_AFFINE_2D_NV = 0x9096;
    public static final int GL_TRANSPOSE_AFFINE_3D_NV = 0x9098;
    public static final int GL_UTF8_NV = 0x909A;
    public static final int GL_UTF16_NV = 0x909B;
    public static final int GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV = 0x909C;
    public static final int GL_PATH_COMMAND_COUNT_NV = 0x909D;
    public static final int GL_PATH_COORD_COUNT_NV = 0x909E;
    public static final int GL_PATH_DASH_ARRAY_COUNT_NV = 0x909F;
    public static final int GL_PATH_COMPUTED_LENGTH_NV = 0x90A0;
    public static final int GL_PATH_FILL_BOUNDING_BOX_NV = 0x90A1;
    public static final int GL_PATH_STROKE_BOUNDING_BOX_NV = 0x90A2;
    public static final int GL_SQUARE_NV = 0x90A3;
    public static final int GL_ROUND_NV = 0x90A4;
    public static final int GL_TRIANGULAR_NV = 0x90A5;
    public static final int GL_BEVEL_NV = 0x90A6;
    public static final int GL_MITER_REVERT_NV = 0x90A7;
    public static final int GL_MITER_TRUNCATE_NV = 0x90A8;
    public static final int GL_SKIP_MISSING_GLYPH_NV = 0x90A9;
    public static final int GL_USE_MISSING_GLYPH_NV = 0x90AA;
    public static final int GL_PATH_ERROR_POSITION_NV = 0x90AB;
    public static final int GL_ACCUM_ADJACENT_PAIRS_NV = 0x90AD;
    public static final int GL_ADJACENT_PAIRS_NV = 0x90AE;
    public static final int GL_FIRST_TO_REST_NV = 0x90AF;
    public static final int GL_PATH_GEN_MODE_NV = 0x90B0;
    public static final int GL_PATH_GEN_COEFF_NV = 0x90B1;
    public static final int GL_PATH_GEN_COMPONENTS_NV = 0x90B3;
    public static final int GL_PATH_STENCIL_FUNC_NV = 0x90B7;
    public static final int GL_PATH_STENCIL_REF_NV = 0x90B8;
    public static final int GL_PATH_STENCIL_VALUE_MASK_NV = 0x90B9;
    public static final int GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV = 0x90BD;
    public static final int GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV = 0x90BE;
    public static final int GL_PATH_COVER_DEPTH_FUNC_NV = 0x90BF;
    public static final int GL_PATH_DASH_OFFSET_RESET_NV = 0x90B4;
    public static final int GL_MOVE_TO_RESETS_NV = 0x90B5;
    public static final int GL_MOVE_TO_CONTINUES_NV = 0x90B6;
    public static final int GL_CLOSE_PATH_NV = 0x00;
    public static final int GL_MOVE_TO_NV = 0x02;
    public static final int GL_RELATIVE_MOVE_TO_NV = 0x03;
    public static final int GL_LINE_TO_NV = 0x04;
    public static final int GL_RELATIVE_LINE_TO_NV = 0x05;
    public static final int GL_HORIZONTAL_LINE_TO_NV = 0x06;
    public static final int GL_RELATIVE_HORIZONTAL_LINE_TO_NV = 0x07;
    public static final int GL_VERTICAL_LINE_TO_NV = 0x08;
    public static final int GL_RELATIVE_VERTICAL_LINE_TO_NV = 0x09;
    public static final int GL_QUADRATIC_CURVE_TO_NV = 0x0A;
    public static final int GL_RELATIVE_QUADRATIC_CURVE_TO_NV = 0x0B;
    public static final int GL_CUBIC_CURVE_TO_NV = 0x0C;
    public static final int GL_RELATIVE_CUBIC_CURVE_TO_NV = 0x0D;
    public static final int GL_SMOOTH_QUADRATIC_CURVE_TO_NV = 0x0E;
    public static final int GL_RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV = 0x0F;
    public static final int GL_SMOOTH_CUBIC_CURVE_TO_NV = 0x10;
    public static final int GL_RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV = 0x11;
    public static final int GL_SMALL_CCW_ARC_TO_NV = 0x12;
    public static final int GL_RELATIVE_SMALL_CCW_ARC_TO_NV = 0x13;
    public static final int GL_SMALL_CW_ARC_TO_NV = 0x14;
    public static final int GL_RELATIVE_SMALL_CW_ARC_TO_NV = 0x15;
    public static final int GL_LARGE_CCW_ARC_TO_NV = 0x16;
    public static final int GL_RELATIVE_LARGE_CCW_ARC_TO_NV = 0x17;
    public static final int GL_LARGE_CW_ARC_TO_NV = 0x18;
    public static final int GL_RELATIVE_LARGE_CW_ARC_TO_NV = 0x19;
    public static final int GL_RESTART_PATH_NV = 0xF0;
    public static final int GL_DUP_FIRST_CUBIC_CURVE_TO_NV = 0xF2;
    public static final int GL_DUP_LAST_CUBIC_CURVE_TO_NV = 0xF4;
    public static final int GL_RECT_NV = 0xF6;
    public static final int GL_CIRCULAR_CCW_ARC_TO_NV = 0xF8;
    public static final int GL_CIRCULAR_CW_ARC_TO_NV = 0xFA;
    public static final int GL_CIRCULAR_TANGENT_ARC_TO_NV = 0xFC;
    public static final int GL_ARC_TO_NV = 0xFE;
    public static final int GL_RELATIVE_ARC_TO_NV = 0xFF;
    public static final int GL_BOLD_BIT_NV = 0x01;
    public static final int GL_ITALIC_BIT_NV = 0x02;
    public static final int GL_GLYPH_WIDTH_BIT_NV = 0x01;
    public static final int GL_GLYPH_HEIGHT_BIT_NV = 0x02;
    public static final int GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV = 0x04;
    public static final int GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV = 0x08;
    public static final int GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV = 0x10;
    public static final int GL_GLYPH_VERTICAL_BEARING_X_BIT_NV = 0x20;
    public static final int GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV = 0x40;
    public static final int GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV = 0x80;
    public static final int GL_GLYPH_HAS_KERNING_BIT_NV = 0x100;
    public static final int GL_FONT_X_MIN_BOUNDS_BIT_NV = 0x00010000;
    public static final int GL_FONT_Y_MIN_BOUNDS_BIT_NV = 0x00020000;
    public static final int GL_FONT_X_MAX_BOUNDS_BIT_NV = 0x00040000;
    public static final int GL_FONT_Y_MAX_BOUNDS_BIT_NV = 0x00080000;
    public static final int GL_FONT_UNITS_PER_EM_BIT_NV = 0x00100000;
    public static final int GL_FONT_ASCENDER_BIT_NV = 0x00200000;
    public static final int GL_FONT_DESCENDER_BIT_NV = 0x00400000;
    public static final int GL_FONT_HEIGHT_BIT_NV = 0x00800000;
    public static final int GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV = 0x01000000;
    public static final int GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV = 0x02000000;
    public static final int GL_FONT_UNDERLINE_POSITION_BIT_NV = 0x04000000;
    public static final int GL_FONT_UNDERLINE_THICKNESS_BIT_NV = 0x08000000;
    public static final int GL_FONT_HAS_KERNING_BIT_NV = 0x10000000;
    public static final int GL_ROUNDED_RECT_NV = 0xE8;
    public static final int GL_RELATIVE_ROUNDED_RECT_NV = 0xE9;
    public static final int GL_ROUNDED_RECT2_NV = 0xEA;
    public static final int GL_RELATIVE_ROUNDED_RECT2_NV = 0xEB;
    public static final int GL_ROUNDED_RECT4_NV = 0xEC;
    public static final int GL_RELATIVE_ROUNDED_RECT4_NV = 0xED;
    public static final int GL_ROUNDED_RECT8_NV = 0xEE;
    public static final int GL_RELATIVE_ROUNDED_RECT8_NV = 0xEF;
    public static final int GL_RELATIVE_RECT_NV = 0xF7;
    public static final int GL_FONT_GLYPHS_AVAILABLE_NV = 0x9368;
    public static final int GL_FONT_TARGET_UNAVAILABLE_NV = 0x9369;
    public static final int GL_FONT_UNAVAILABLE_NV = 0x936A;
    public static final int GL_FONT_UNINTELLIGIBLE_NV = 0x936B;
    public static final int GL_CONIC_CURVE_TO_NV = 0x1A;
    public static final int GL_RELATIVE_CONIC_CURVE_TO_NV = 0x1B;
    public static final int GL_FONT_NUM_GLYPH_INDICES_BIT_NV = 0x20000000;
    public static final int GL_STANDARD_FONT_FORMAT_NV = 0x936C;
    public static final int GL_PATH_PROJECTION_NV = 0x1701;
    public static final int GL_PATH_MODELVIEW_NV = 0x1700;
    public static final int GL_PATH_MODELVIEW_STACK_DEPTH_NV = 0x0BA3;
    public static final int GL_PATH_MODELVIEW_MATRIX_NV = 0x0BA6;
    public static final int GL_PATH_MAX_MODELVIEW_STACK_DEPTH_NV = 0x0D36;
    public static final int GL_PATH_TRANSPOSE_MODELVIEW_MATRIX_NV = 0x84E3;
    public static final int GL_PATH_PROJECTION_STACK_DEPTH_NV = 0x0BA4;
    public static final int GL_PATH_PROJECTION_MATRIX_NV = 0x0BA7;
    public static final int GL_PATH_MAX_PROJECTION_STACK_DEPTH_NV = 0x0D38;
    public static final int GL_PATH_TRANSPOSE_PROJECTION_MATRIX_NV = 0x84E4;
    public static final int GL_FRAGMENT_INPUT_NV = 0x936D;
    public static final int GL_NV_path_rendering_shared_edge = 1;
    public static final int GL_SHARED_EDGE_NV = 0xC0;
    public static final int GL_NV_primitive_shading_rate = 1;
    public static final int GL_SHADING_RATE_IMAGE_PER_PRIMITIVE_NV = 0x95B1;
    public static final int GL_SHADING_RATE_IMAGE_PALETTE_COUNT_NV = 0x95B2;
    public static final int GL_NV_representative_fragment_test = 1;
    public static final int GL_REPRESENTATIVE_FRAGMENT_TEST_NV = 0x937F;
    public static final int GL_NV_sample_locations = 1;
    public static final int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_NV = 0x933D;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV = 0x933E;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV = 0x933F;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV = 0x9340;
    public static final int GL_SAMPLE_LOCATION_NV = 0x8E50;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9341;
    public static final int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV = 0x9342;
    public static final int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV = 0x9343;
    public static final int GL_NV_sample_mask_override_coverage = 1;
    public static final int GL_NV_scissor_exclusive = 1;
    public static final int GL_SCISSOR_TEST_EXCLUSIVE_NV = 0x9555;
    public static final int GL_SCISSOR_BOX_EXCLUSIVE_NV = 0x9556;
    public static final int GL_NV_shader_atomic_counters = 1;
    public static final int GL_NV_shader_atomic_float = 1;
    public static final int GL_NV_shader_atomic_float64 = 1;
    public static final int GL_NV_shader_atomic_fp16_vector = 1;
    public static final int GL_NV_shader_atomic_int64 = 1;
    public static final int GL_NV_shader_buffer_load = 1;
    public static final int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;
    public static final int GL_GPU_ADDRESS_NV = 0x8F34;
    public static final int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;
    public static final int GL_NV_shader_buffer_store = 1;
    public static final int GL_SHADER_GLOBAL_ACCESS_BARRIER_BIT_NV = 0x00000010;
    public static final int GL_NV_shader_subgroup_partitioned = 1;
    public static final int GL_SUBGROUP_FEATURE_PARTITIONED_BIT_NV = 0x00000100;
    public static final int GL_NV_shader_texture_footprint = 1;
    public static final int GL_NV_shader_thread_group = 1;
    public static final int GL_WARP_SIZE_NV = 0x9339;
    public static final int GL_WARPS_PER_SM_NV = 0x933A;
    public static final int GL_SM_COUNT_NV = 0x933B;
    public static final int GL_NV_shader_thread_shuffle = 1;
    public static final int GL_NV_shading_rate_image = 1;
    public static final int GL_SHADING_RATE_IMAGE_NV = 0x9563;
    public static final int GL_SHADING_RATE_NO_INVOCATIONS_NV = 0x9564;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV = 0x9565;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV = 0x9566;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV = 0x9567;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV = 0x9568;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV = 0x9569;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV = 0x956A;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV = 0x956B;
    public static final int GL_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV = 0x956C;
    public static final int GL_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV = 0x956D;
    public static final int GL_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV = 0x956E;
    public static final int GL_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV = 0x956F;
    public static final int GL_SHADING_RATE_IMAGE_BINDING_NV = 0x955B;
    public static final int GL_SHADING_RATE_IMAGE_TEXEL_WIDTH_NV = 0x955C;
    public static final int GL_SHADING_RATE_IMAGE_TEXEL_HEIGHT_NV = 0x955D;
    public static final int GL_SHADING_RATE_IMAGE_PALETTE_SIZE_NV = 0x955E;
    public static final int GL_MAX_COARSE_FRAGMENT_SAMPLES_NV = 0x955F;
    public static final int GL_SHADING_RATE_SAMPLE_ORDER_DEFAULT_NV = 0x95AE;
    public static final int GL_SHADING_RATE_SAMPLE_ORDER_PIXEL_MAJOR_NV = 0x95AF;
    public static final int GL_SHADING_RATE_SAMPLE_ORDER_SAMPLE_MAJOR_NV = 0x95B0;
    public static final int GL_NV_stereo_view_rendering = 1;
    public static final int GL_NV_texture_barrier = 1;
    public static final int GL_NV_texture_rectangle_compressed = 1;
    public static final int GL_NV_uniform_buffer_std430_layout = 1;
    public static final int GL_NV_uniform_buffer_unified_memory = 1;
    public static final int GL_UNIFORM_BUFFER_UNIFIED_NV = 0x936E;
    public static final int GL_UNIFORM_BUFFER_ADDRESS_NV = 0x936F;
    public static final int GL_UNIFORM_BUFFER_LENGTH_NV = 0x9370;
    public static final int GL_NV_vertex_attrib_integer_64bit = 1;
    public static final int GL_NV_vertex_buffer_unified_memory = 1;
    public static final int GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV = 0x8F1E;
    public static final int GL_ELEMENT_ARRAY_UNIFIED_NV = 0x8F1F;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV = 0x8F20;
    public static final int GL_VERTEX_ARRAY_ADDRESS_NV = 0x8F21;
    public static final int GL_NORMAL_ARRAY_ADDRESS_NV = 0x8F22;
    public static final int GL_COLOR_ARRAY_ADDRESS_NV = 0x8F23;
    public static final int GL_INDEX_ARRAY_ADDRESS_NV = 0x8F24;
    public static final int GL_TEXTURE_COORD_ARRAY_ADDRESS_NV = 0x8F25;
    public static final int GL_EDGE_FLAG_ARRAY_ADDRESS_NV = 0x8F26;
    public static final int GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV = 0x8F27;
    public static final int GL_FOG_COORD_ARRAY_ADDRESS_NV = 0x8F28;
    public static final int GL_ELEMENT_ARRAY_ADDRESS_NV = 0x8F29;
    public static final int GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV = 0x8F2A;
    public static final int GL_VERTEX_ARRAY_LENGTH_NV = 0x8F2B;
    public static final int GL_NORMAL_ARRAY_LENGTH_NV = 0x8F2C;
    public static final int GL_COLOR_ARRAY_LENGTH_NV = 0x8F2D;
    public static final int GL_INDEX_ARRAY_LENGTH_NV = 0x8F2E;
    public static final int GL_TEXTURE_COORD_ARRAY_LENGTH_NV = 0x8F2F;
    public static final int GL_EDGE_FLAG_ARRAY_LENGTH_NV = 0x8F30;
    public static final int GL_SECONDARY_COLOR_ARRAY_LENGTH_NV = 0x8F31;
    public static final int GL_FOG_COORD_ARRAY_LENGTH_NV = 0x8F32;
    public static final int GL_ELEMENT_ARRAY_LENGTH_NV = 0x8F33;
    public static final int GL_DRAW_INDIRECT_UNIFIED_NV = 0x8F40;
    public static final int GL_DRAW_INDIRECT_ADDRESS_NV = 0x8F41;
    public static final int GL_DRAW_INDIRECT_LENGTH_NV = 0x8F42;
    public static final int GL_NV_viewport_array2 = 1;
    public static final int GL_NV_viewport_swizzle = 1;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV = 0x9350;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV = 0x9351;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV = 0x9352;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV = 0x9353;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV = 0x9354;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV = 0x9355;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV = 0x9356;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV = 0x9357;
    public static final int GL_VIEWPORT_SWIZZLE_X_NV = 0x9358;
    public static final int GL_VIEWPORT_SWIZZLE_Y_NV = 0x9359;
    public static final int GL_VIEWPORT_SWIZZLE_Z_NV = 0x935A;
    public static final int GL_VIEWPORT_SWIZZLE_W_NV = 0x935B;
    public static final int GL_OVR_multiview = 1;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR = 0x9630;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR = 0x9632;
    public static final int GL_MAX_VIEWS_OVR = 0x9631;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR = 0x9633;
    public static final int GL_OVR_multiview2 = 1;

    @Import(name = "glBlendBarrier")
    public static native void glBlendBarrier();

    @Import(name = "glCopyImageSubData")
    public static native void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth);

    @Import(name = "glDebugMessageControl")
    public static native void glDebugMessageControl(int source, int type, int severity, Address ids, boolean enabled);

    @Import(name = "glDebugMessageInsert")
    public static native void glDebugMessageInsert(int source, int type, int id, int severity, String buf);

    @Import(name = "glDebugMessageCallback")
    public static native void glDebugMessageCallback(GL32.DebugProc callback);

    @Import(name = "glGetDebugMessageLog")
    public static native int glGetDebugMessageLog(int count, Address sources, Address types, Address ids, Address severities, Address lengths, Address messageLog);

    @Import(name = "glPushDebugGroup")
    public static native void glPushDebugGroup(int source, int id, String message);

    @Import(name = "glPopDebugGroup")
    public static native void glPopDebugGroup();

    @Import(name = "glObjectLabel")
    public static native void glObjectLabel(int identifier, int name, String label);

    @Import(name = "glGetObjectLabel")
    public static native String glGetObjectLabel(int identifier, int name);

    @Import(name = "glGetPointerv")
    public static native long glGetPointerv(int pname);

    @Import(name = "glEnablei")
    public static native void glEnablei(int target, int index);

    @Import(name = "glDisablei")
    public static native void glDisablei(int target, int index);

    @Import(name = "glBlendEquationi")
    public static native void glBlendEquationi(int buf, int mode);

    @Import(name = "glBlendEquationSeparatei")
    public static native void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha);

    @Import(name = "glBlendFunci")
    public static native void glBlendFunci(int buf, int src, int dst);

    @Import(name = "glBlendFuncSeparatei")
    public static native void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    @Import(name = "glColorMaski")
    public static native void glColorMaski(int index, boolean r, boolean g, boolean b, boolean a);

    @Import(name = "glIsEnabledi")
    public static native boolean glIsEnabledi(int target, int index);

    @Import(name = "glDrawElementsBaseVertex")
    public static native void glDrawElementsBaseVertex(int mode, int count, int type, Address indices, int basevertex);

    @Import(name = "glDrawRangeElementsBaseVertex")
    public static native void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, Address indices, int basevertex);

    @Import(name = "glDrawElementsInstancedBaseVertex")
    public static native void glDrawElementsInstancedBaseVertex(int mode, int count, int type, Address indices, int instanceCount, int basevertex);

    @Import(name = "glDrawElementsInstancedBaseVertex")
    public static native void glDrawElementsInstancedBaseVertex(int mode, int count, int type, int indicesOffset, int instanceCount, int basevertex);

    @Import(name = "glFramebufferTexture")
    public static native void glFramebufferTexture(int target, int attachment, int texture, int level);

    @Import(name = "glGetGraphicsResetStatus")
    public static native int glGetGraphicsResetStatus();

    @Import(name = "glReadnPixels")
    public static native void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, Address data);

    @Import(name = "glGetnUniformfv")
    public static native void glGetnUniformfv(int program, int location, Address params);

    @Import(name = "glGetnUniformiv")
    public static native void glGetnUniformiv(int program, int location, Address params);

    @Import(name = "glGetnUniformuiv")
    public static native void glGetnUniformuiv(int program, int location, Address params);

    @Import(name = "glMinSampleShading")
    public static native void glMinSampleShading(float value);

    @Import(name = "glPatchParameteri")
    public static native void glPatchParameteri(int pname, int value);

    @Import(name = "glTexParameterIiv")
    public static native void glTexParameterIiv(int target, int pname, Address params);

    @Import(name = "glTexParameterIuiv")
    public static native void glTexParameterIuiv(int target, int pname, Address params);

    @Import(name = "glGetTexParameterIiv")
    public static native void glGetTexParameterIiv(int target, int pname, Address params);

    @Import(name = "glGetTexParameterIuiv")
    public static native void glGetTexParameterIuiv(int target, int pname, Address params);

    @Import(name = "glSamplerParameterIiv")
    public static native void glSamplerParameterIiv(int sampler, int pname, Address param);

    @Import(name = "glSamplerParameterIuiv")
    public static native void glSamplerParameterIuiv(int sampler, int pname, Address param);

    @Import(name = "glGetSamplerParameterIiv")
    public static native void glGetSamplerParameterIiv(int sampler, int pname, Address params);

    @Import(name = "glGetSamplerParameterIuiv")
    public static native void glGetSamplerParameterIuiv(int sampler, int pname, Address params);

    @Import(name = "glTexBuffer")
    public static native void glTexBuffer(int target, int internalformat, int buffer);

    @Import(name = "glTexBufferRange")
    public static native void glTexBufferRange(int target, int internalformat, int buffer, int offset, int size);

    @Import(name = "glTexStorage3DMultisample")
    public static native void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations);

    @Import(name = "glDispatchCompute")
    public static native void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z);

    @Import(name = "glDispatchComputeIndirect")
    public static native void glDispatchComputeIndirect(long indirect);

    @Import(name = "glDrawArraysIndirect")
    public static native void glDrawArraysIndirect(int mode, long indirect);

    @Import(name = "glDrawElementsIndirect")
    public static native void glDrawElementsIndirect(int mode, int type, long indirect);

    @Import(name = "glFramebufferParameteri")
    public static native void glFramebufferParameteri(int target, int pname, int param);

    @Import(name = "glGetFramebufferParameteriv")
    public static native void glGetFramebufferParameteriv(int target, int pname, Address params);

    @Import(name = "glGetProgramInterfaceiv")
    public static native void glGetProgramInterfaceiv(int program, int programInterface, int pname, Address params);

    @Import(name = "glGetProgramResourceIndex")
    public static native int glGetProgramResourceIndex(int program, int programInterface, String name);

    @Import(name = "glGetProgramResourceName")
    public static native String glGetProgramResourceName(int program, int programInterface, int index);

    @Import(name = "glGetProgramResourceiv")
    public static native void glGetProgramResourceiv(int program, int programInterface, int index, Address props, Address length, Address params);

    @Import(name = "glGetProgramResourceLocation")
    public static native int glGetProgramResourceLocation(int program, int programInterface, String name);

    @Import(name = "glUseProgramStages")
    public static native void glUseProgramStages(int pipeline, int stages, int program);

    @Import(name = "glActiveShaderProgram")
    public static native void glActiveShaderProgram(int pipeline, int program);

    @Import(name = "glCreateShaderProgramv")
    public static native int glCreateShaderProgramv(int type, String[] strings);

    @Import(name = "glBindProgramPipeline")
    public static native void glBindProgramPipeline(int pipeline);

    @Import(name = "glDeleteProgramPipelines")
    public static native void glDeleteProgramPipelines(int n, Address pipelines);

    @Import(name = "glGenProgramPipelines")
    public static native void glGenProgramPipelines(int n, Address pipelines);

    @Import(name = "glIsProgramPipeline")
    public static native boolean glIsProgramPipeline(int pipeline);

    @Import(name = "glGetProgramPipelineiv")
    public static native void glGetProgramPipelineiv(int pipeline, int pname, Address params);

    @Import(name = "glProgramUniform1i")
    public static native void glProgramUniform1i(int program, int location, int v0);

    @Import(name = "glProgramUniform2i")
    public static native void glProgramUniform2i(int program, int location, int v0, int v1);

    @Import(name = "glProgramUniform3i")
    public static native void glProgramUniform3i(int program, int location, int v0, int v1, int v2);

    @Import(name = "glProgramUniform4i")
    public static native void glProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3);

    @Import(name = "glProgramUniform1ui")
    public static native void glProgramUniform1ui(int program, int location, int v0);

    @Import(name = "glProgramUniform2ui")
    public static native void glProgramUniform2ui(int program, int location, int v0, int v1);

    @Import(name = "glProgramUniform3ui")
    public static native void glProgramUniform3ui(int program, int location, int v0, int v1, int v2);

    @Import(name = "glProgramUniform4ui")
    public static native void glProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3);

    @Import(name = "glProgramUniform1f")
    public static native void glProgramUniform1f(int program, int location, float v0);

    @Import(name = "glProgramUniform2f")
    public static native void glProgramUniform2f(int program, int location, float v0, float v1);

    @Import(name = "glProgramUniform3f")
    public static native void glProgramUniform3f(int program, int location, float v0, float v1, float v2);

    @Import(name = "glProgramUniform4f")
    public static native void glProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3);

    @Import(name = "glProgramUniform1iv")
    public static native void glProgramUniform1iv(int program, int location, Address value);

    @Import(name = "glProgramUniform2iv")
    public static native void glProgramUniform2iv(int program, int location, Address value);

    @Import(name = "glProgramUniform3iv")
    public static native void glProgramUniform3iv(int program, int location, Address value);

    @Import(name = "glProgramUniform4iv")
    public static native void glProgramUniform4iv(int program, int location, Address value);

    @Import(name = "glProgramUniform1uiv")
    public static native void glProgramUniform1uiv(int program, int location, Address value);

    @Import(name = "glProgramUniform2uiv")
    public static native void glProgramUniform2uiv(int program, int location, Address value);

    @Import(name = "glProgramUniform3uiv")
    public static native void glProgramUniform3uiv(int program, int location, Address value);

    @Import(name = "glProgramUniform4uiv")
    public static native void glProgramUniform4uiv(int program, int location, Address value);

    @Import(name = "glProgramUniform1fv")
    public static native void glProgramUniform1fv(int program, int location, Address value);

    @Import(name = "glProgramUniform2fv")
    public static native void glProgramUniform2fv(int program, int location, Address value);

    @Import(name = "glProgramUniform3fv")
    public static native void glProgramUniform3fv(int program, int location, Address value);

    @Import(name = "glProgramUniform4fv")
    public static native void glProgramUniform4fv(int program, int location, Address value);

    @Import(name = "glProgramUniformMatrix2fv")
    public static native void glProgramUniformMatrix2fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix3fv")
    public static native void glProgramUniformMatrix3fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix4fv")
    public static native void glProgramUniformMatrix4fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix2x3fv")
    public static native void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix3x2fv")
    public static native void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix2x4fv")
    public static native void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix4x2fv")
    public static native void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix3x4fv")
    public static native void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix4x3fv")
    public static native void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glValidateProgramPipeline")
    public static native void glValidateProgramPipeline(int pipeline);

    @Import(name = "glGetProgramPipelineInfoLog")
    public static native String glGetProgramPipelineInfoLog(int program);

    @Import(name = "glBindImageTexture")
    public static native void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format);

    @Import(name = "glGetBooleani_v")
    public static native void glGetBooleani_v(int target, int index, Address data);

    @Import(name = "glMemoryBarrier")
    public static native void glMemoryBarrier(int barriers);

    @Import(name = "glMemoryBarrierByRegion")
    public static native void glMemoryBarrierByRegion(int barriers);

    @Import(name = "glTexStorage2DMultisample")
    public static native void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations);

    @Import(name = "glGetMultisamplefv")
    public static native void glGetMultisamplefv(int pname, int index, Address val);

    @Import(name = "glSampleMaski")
    public static native void glSampleMaski(int maskNumber, int mask);

    @Import(name = "glGetTexLevelParameteriv")
    public static native void glGetTexLevelParameteriv(int target, int level, int pname, Address params);

    @Import(name = "glGetTexLevelParameterfv")
    public static native void glGetTexLevelParameterfv(int target, int level, int pname, Address params);

    @Import(name = "glBindVertexBuffer")
    public static native void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride);

    @Import(name = "glVertexAttribFormat")
    public static native void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset);

    @Import(name = "glVertexAttribIFormat")
    public static native void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset);

    @Import(name = "glVertexAttribBinding")
    public static native void glVertexAttribBinding(int attribindex, int bindingindex);

    @Import(name = "glVertexBindingDivisor")
    public static native void glVertexBindingDivisor(int bindingindex, int divisor);

    @Import(name = "glReadBuffer")
    public static native void glReadBuffer(int mode);

    @Import(name = "glDrawRangeElements")
    public static native void glDrawRangeElements(int mode, int start, int end, int count, int type, Address indices);

    @Import(name = "glDrawRangeElements")
    public static native void glDrawRangeElements(int mode, int start, int end, int count, int type, int offset);

    @Import(name = "glTexImage2D")
    public static native void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int offset);

    @Import(name = "glTexImage3D")
    public static native void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, Address pixels);

    @Import(name = "glTexImage3D")
    public static native void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int offset);

    @Import(name = "glTexSubImage2D")
    public static native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int offset);

    @Import(name = "glTexSubImage3D")
    public static native void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, Address pixels);

    @Import(name = "glTexSubImage3D")
    public static native void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int offset);

    @Import(name = "glCopyTexSubImage3D")
    public static native void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);

    @Import(name = "glGenQueries")
    public static native void glGenQueries(int n, Address ids, int offset);

    @Import(name = "glGenQueries")
    public static native void glGenQueries(int n, Address ids);

    @Import(name = "glDeleteQueries")
    public static native void glDeleteQueries(int n, Address ids, int offset);

    @Import(name = "glDeleteQueries")
    public static native void glDeleteQueries(int n, Address ids);

    @Import(name = "glIsQuery")
    public static native boolean glIsQuery(int id);

    @Import(name = "glBeginQuery")
    public static native void glBeginQuery(int target, int id);

    @Import(name = "glEndQuery")
    public static native void glEndQuery(int target);

    @Import(name = "glGetQueryiv")
    public static native void glGetQueryiv(int target, int pname, Address params);

    @Import(name = "glGetQueryObjectuiv")
    public static native void glGetQueryObjectuiv(int id, int pname, Address params);

    @Import(name = "glUnmapBuffer")
    public static native boolean glUnmapBuffer(int target);

    @Import(name = "glGetBufferPointerv")
    public static native Address glGetBufferPointerv(int target, int pname);

    @Import(name = "glDrawBuffers")
    public static native void glDrawBuffers(int n, Address bufs);

    @Import(name = "glUniformMatrix2x3fv")
    public static native void glUniformMatrix2x3fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix3x2fv")
    public static native void glUniformMatrix3x2fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix2x4fv")
    public static native void glUniformMatrix2x4fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix4x2fv")
    public static native void glUniformMatrix4x2fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix3x4fv")
    public static native void glUniformMatrix3x4fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix4x3fv")
    public static native void glUniformMatrix4x3fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glBlitFramebuffer")
    public static native void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);

    @Import(name = "glRenderbufferStorageMultisample")
    public static native void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height);

    @Import(name = "glFramebufferTextureLayer")
    public static native void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer);

    @Import(name = "glMapBufferRange")
    public static native Address glMapBufferRange(int target, int offset, int length, int access);

    @Import(name = "glFlushMappedBufferRange")
    public static native void glFlushMappedBufferRange(int target, int offset, int length);

    @Import(name = "glBindVertexArray")
    public static native void glBindVertexArray(int array);

    @Import(name = "glDeleteVertexArrays")
    public static native void glDeleteVertexArrays(int n, Address arrays);

    @Import(name = "glDeleteVertexArrays")
    public static native void glDeleteVertexArrays(int n, Address arrays, int offset);

    @Import(name = "glGenVertexArrays")
    public static native void glGenVertexArrays(int n, Address arrays);

    @Import(name = "glGenVertexArrays")
    public static native void glGenVertexArrays(int n, Address arrays, int offset);

    @Import(name = "glIsVertexArray")
    public static native boolean glIsVertexArray(int array);

    @Import(name = "glBeginTransformFeedback")
    public static native void glBeginTransformFeedback(int primitiveMode);

    @Import(name = "glEndTransformFeedback")
    public static native void glEndTransformFeedback();

    @Import(name = "glBindBufferRange")
    public static native void glBindBufferRange(int target, int index, int buffer, int offset, int size);

    @Import(name = "glBindBufferBase")
    public static native void glBindBufferBase(int target, int index, int buffer);

    @Import(name = "glTransformFeedbackVaryings")
    public static native void glTransformFeedbackVaryings(int program, String[] varyings, int bufferMode);

    @Import(name = "glVertexAttribIPointer")
    public static native void glVertexAttribIPointer(int index, int size, int type, int stride, int offset);

    @Import(name = "glGetVertexAttribIiv")
    public static native void glGetVertexAttribIiv(int index, int pname, Address params);

    @Import(name = "glGetVertexAttribIuiv")
    public static native void glGetVertexAttribIuiv(int index, int pname, Address params);

    @Import(name = "glVertexAttribI4i")
    public static native void glVertexAttribI4i(int index, int x, int y, int z, int w);

    @Import(name = "glVertexAttribI4ui")
    public static native void glVertexAttribI4ui(int index, int x, int y, int z, int w);

    @Import(name = "glGetUniformuiv")
    public static native void glGetUniformuiv(int program, int location, Address params);

    @Import(name = "glGetFragDataLocation")
    public static native int glGetFragDataLocation(int program, String name);

    @Import(name = "glUniform1uiv")
    public static native void glUniform1uiv(int location, int count, Address value);

    @Import(name = "glUniform3uiv")
    public static native void glUniform3uiv(int location, int count, Address value);

    @Import(name = "glUniform4uiv")
    public static native void glUniform4uiv(int location, int count, Address value);

    @Import(name = "glClearBufferiv")
    public static native void glClearBufferiv(int buffer, int drawbuffer, Address value);

    @Import(name = "glClearBufferuiv")
    public static native void glClearBufferuiv(int buffer, int drawbuffer, Address value);

    @Import(name = "glClearBufferfv")
    public static native void glClearBufferfv(int buffer, int drawbuffer, Address value);

    @Import(name = "glClearBufferfi")
    public static native void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);

    @Import(name = "glGetStringi")
    public static native String glGetStringi(int name, int index);

    @Import(name = "glCopyBufferSubData")
    public static native void glCopyBufferSubData(int readTarget, int writeTarget, int readOffset, int writeOffset, int size);

    @Import(name = "glGetUniformIndices")
    public static native void glGetUniformIndices(int program, String[] uniformNames, Address uniformIndices);

    @Import(name = "glGetActiveUniformsiv")
    public static native void glGetActiveUniformsiv(int program, int uniformCount, Address uniformIndices, int pname, Address params);

    @Import(name = "glGetUniformBlockIndex")
    public static native int glGetUniformBlockIndex(int program, String uniformBlockName);

    @Import(name = "glGetActiveUniformBlockiv")
    public static native void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, Address params);

    @Import(name = "glGetActiveUniformBlockName")
    public static native void glGetActiveUniformBlockName(int program, int uniformBlockIndex, Address length, Address uniformBlockName);

    @Import(name = "glGetActiveUniformBlockName")
    public static native String glGetActiveUniformBlockName(int program, int uniformBlockIndex);

    @Import(name = "glUniformBlockBinding")
    public static native void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding);

    @Import(name = "glDrawArraysInstanced")
    public static native void glDrawArraysInstanced(int mode, int first, int count, int instanceCount);

    @Import(name = "glDrawElementsInstanced")
    public static native void glDrawElementsInstanced(int mode, int count, int type, int indicesOffset, int instanceCount);

    @Import(name = "glGetInteger64v")
    public static native void glGetInteger64v(int pname, Address params);

    @Import(name = "glGetBufferParameteri64v")
    public static native void glGetBufferParameteri64v(int target, int pname, Address params);

    @Import(name = "glGenSamplers")
    public static native void glGenSamplers(int count, Address samplers, int offset);

    @Import(name = "glGenSamplers")
    public static native void glGenSamplers(int count, Address samplers);

    @Import(name = "glDeleteSamplers")
    public static native void glDeleteSamplers(int count, Address samplers, int offset);

    @Import(name = "glDeleteSamplers")
    public static native void glDeleteSamplers(int count, Address samplers);

    @Import(name = "glIsSampler")
    public static native boolean glIsSampler(int sampler);

    @Import(name = "glBindSampler")
    public static native void glBindSampler(int unit, int sampler);

    @Import(name = "glSamplerParameteri")
    public static native void glSamplerParameteri(int sampler, int pname, int param);

    @Import(name = "glSamplerParameteriv")
    public static native void glSamplerParameteriv(int sampler, int pname, Address param);

    @Import(name = "glSamplerParameterf")
    public static native void glSamplerParameterf(int sampler, int pname, float param);

    @Import(name = "glSamplerParameterfv")
    public static native void glSamplerParameterfv(int sampler, int pname, Address param);

    @Import(name = "glGetSamplerParameteriv")
    public static native void glGetSamplerParameteriv(int sampler, int pname, Address params);

    @Import(name = "glGetSamplerParameterfv")
    public static native void glGetSamplerParameterfv(int sampler, int pname, Address params);

    @Import(name = "glVertexAttribDivisor")
    public static native void glVertexAttribDivisor(int index, int divisor);

    @Import(name = "glBindTransformFeedback")
    public static native void glBindTransformFeedback(int target, int id);

    @Import(name = "glDeleteTransformFeedbacks")
    public static native void glDeleteTransformFeedbacks(int n, Address ids, int offset);

    @Import(name = "glDeleteTransformFeedbacks")
    public static native void glDeleteTransformFeedbacks(int n, Address ids);

    @Import(name = "glGenTransformFeedbacks")
    public static native void glGenTransformFeedbacks(int n, Address ids, int offset);

    @Import(name = "glGenTransformFeedbacks")
    public static native void glGenTransformFeedbacks(int n, Address ids);

    @Import(name = "glIsTransformFeedback")
    public static native boolean glIsTransformFeedback(int id);

    @Import(name = "glPauseTransformFeedback")
    public static native void glPauseTransformFeedback();

    @Import(name = "glResumeTransformFeedback")
    public static native void glResumeTransformFeedback();

    @Import(name = "glProgramParameteri")
    public static native void glProgramParameteri(int program, int pname, int value);

    @Import(name = "glInvalidateFramebuffer")
    public static native void glInvalidateFramebuffer(int target, int numAttachments, Address attachments);

    @Import(name = "glInvalidateSubFramebuffer")
    public static native void glInvalidateSubFramebuffer(int target, int numAttachments, Address attachments, int x, int y, int width, int height);

    @Import(name = "glActiveTexture")
    public static native void glActiveTexture(int texture);

    @Import(name = "glBindTexture")
    public static native void glBindTexture(int target, int texture);

    @Import(name = "glBlendFunc")
    public static native void glBlendFunc(int sfactor, int dfactor);

    @Import(name = "glClear")
    public static native void glClear(int mask);

    @Import(name = "glClearColor")
    public static native void glClearColor(float red, float green, float blue, float alpha);

    @Import(name = "glClearDepthf")
    public static native void glClearDepthf(float depth);

    @Import(name = "glClearStencil")
    public static native void glClearStencil(int s);

    @Import(name = "glColorMask")
    public static native void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);

    @Import(name = "glCompressedTexImage2D")
    public static native void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, Address data);

    @Import(name = "glCompressedTexSubImage2D")
    public static native void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, Address data);

    @Import(name = "glCopyTexImage2D")
    public static native void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border);

    @Import(name = "glCopyTexSubImage2D")
    public static native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

    @Import(name = "glCullFace")
    public static native void glCullFace(int mode);

    @Import(name = "glDeleteTextures")
    public static native void glDeleteTextures(int n, Address textures);

    @Import(name = "glDeleteTexture")
    public static native void glDeleteTexture(int texture);

    @Import(name = "glDepthFunc")
    public static native void glDepthFunc(int func);

    @Import(name = "glDepthMask")
    public static native void glDepthMask(boolean flag);

    @Import(name = "glDepthRangef")
    public static native void glDepthRangef(float zNear, float zFar);

    @Import(name = "glDisable")
    public static native void glDisable(int cap);

    @Import(name = "glDrawArrays")
    public static native void glDrawArrays(int mode, int first, int count);

    @Import(name = "glDrawElements")
    public static native void glDrawElements(int mode, int count, int type, Address indices);

    @Import(name = "glEnable")
    public static native void glEnable(int cap);

    @Import(name = "glFinish")
    public static native void glFinish();

    @Import(name = "glFlush")
    public static native void glFlush();

    @Import(name = "glFrontFace")
    public static native void glFrontFace(int mode);

    @Import(name = "glGenTextures")
    public static native void glGenTextures(int n, Address textures);

    @Import(name = "glGenTexture")
    public static native int glGenTexture();

    @Import(name = "glGetError")
    public static native int glGetError();

    @Import(name = "glGetIntegerv")
    public static native void glGetIntegerv(int pname, Address params);

    @Import(name = "glGetString")
    public static native String glGetString(int name);

    @Import(name = "glHint")
    public static native void glHint(int target, int mode);

    @Import(name = "glLineWidth")
    public static native void glLineWidth(float width);

    @Import(name = "glPixelStorei")
    public static native void glPixelStorei(int pname, int param);

    @Import(name = "glPolygonOffset")
    public static native void glPolygonOffset(float factor, float units);

    @Import(name = "glReadPixels")
    public static native void glReadPixels(int x, int y, int width, int height, int format, int type, Address pixels);

    @Import(name = "glScissor")
    public static native void glScissor(int x, int y, int width, int height);

    @Import(name = "glStencilFunc")
    public static native void glStencilFunc(int func, int ref, int mask);

    @Import(name = "glStencilMask")
    public static native void glStencilMask(int mask);

    @Import(name = "glStencilOp")
    public static native void glStencilOp(int fail, int zfail, int zpass);

    @Import(name = "glTexImage2D")
    public static native void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, Address pixels);

    @Import(name = "glTexParameterf")
    public static native void glTexParameterf(int target, int pname, float param);

    @Import(name = "glTexSubImage2D")
    public static native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Address pixels);

    @Import(name = "glViewport")
    public static native void glViewport(int x, int y, int width, int height);

    @Import(name = "glAttachShader")
    public static native void glAttachShader(int program, int shader);

    @Import(name = "glBindAttribLocation")
    public static native void glBindAttribLocation(int program, int index, String name);

    @Import(name = "glBindBuffer")
    public static native void glBindBuffer(int target, int buffer);

    @Import(name = "glBindFramebuffer")
    public static native void glBindFramebuffer(int target, int framebuffer);

    @Import(name = "glBindRenderbuffer")
    public static native void glBindRenderbuffer(int target, int renderbuffer);

    @Import(name = "glBlendColor")
    public static native void glBlendColor(float red, float green, float blue, float alpha);

    @Import(name = "glBlendEquation")
    public static native void glBlendEquation(int mode);

    @Import(name = "glBlendEquationSeparate")
    public static native void glBlendEquationSeparate(int modeRGB, int modeAlpha);

    @Import(name = "glBlendFuncSeparate")
    public static native void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    @Import(name = "glBufferData")
    public static native void glBufferData(int target, int size, Address data, int usage);

    @Import(name = "glBufferSubData")
    public static native void glBufferSubData(int target, int offset, int size, Address data);

    @Import(name = "glCheckFramebufferStatus")
    public static native int glCheckFramebufferStatus(int target);

    @Import(name = "glCompileShader")
    public static native void glCompileShader(int shader);

    @Import(name = "glCreateProgram")
    public static native int glCreateProgram();

    @Import(name = "glCreateShader")
    public static native int glCreateShader(int type);

    @Import(name = "glDeleteBuffer")
    public static native void glDeleteBuffer(int buffer);

    @Import(name = "glDeleteBuffers")
    public static native void glDeleteBuffers(int n, Address buffers);

    @Import(name = "glDeleteFramebuffer")
    public static native void glDeleteFramebuffer(int framebuffer);

    @Import(name = "glDeleteFramebuffers")
    public static native void glDeleteFramebuffers(int n, Address framebuffers);

    @Import(name = "glDeleteProgram")
    public static native void glDeleteProgram(int program);

    @Import(name = "glDeleteRenderbuffer")
    public static native void glDeleteRenderbuffer(int renderbuffer);

    @Import(name = "glDeleteRenderbuffers")
    public static native void glDeleteRenderbuffers(int n, Address renderbuffers);

    @Import(name = "glDeleteShader")
    public static native void glDeleteShader(int shader);

    @Import(name = "glDetachShader")
    public static native void glDetachShader(int program, int shader);

    @Import(name = "glDisableVertexAttribArray")
    public static native void glDisableVertexAttribArray(int index);

    @Import(name = "glDrawElements")
    public static native void glDrawElements(int mode, int count, int type, int indices);

    @Import(name = "glEnableVertexAttribArray")
    public static native void glEnableVertexAttribArray(int index);

    @Import(name = "glFramebufferRenderbuffer")
    public static native void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer);

    @Import(name = "glFramebufferTexture2D")
    public static native void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);

    @Import(name = "glGenBuffer")
    public static native int glGenBuffer();

    @Import(name = "glGenBuffers")
    public static native void glGenBuffers(int n, Address buffers);

    @Import(name = "glGenerateMipmap")
    public static native void glGenerateMipmap(int target);

    @Import(name = "glGenFramebuffer")
    public static native int glGenFramebuffer();

    @Import(name = "glGenFramebuffers")
    public static native void glGenFramebuffers(int n, Address framebuffers);

    @Import(name = "glGenRenderbuffer")
    public static native int glGenRenderbuffer();

    @Import(name = "glGenRenderbuffers")
    public static native void glGenRenderbuffers(int n, Address renderbuffers);

    @Import(name = "glGetActiveAttrib")
    public static native String glGetActiveAttrib(int program, int index, Address size, Address type);

    @Import(name = "glGetActiveUniform")
    public static native String glGetActiveUniform(int program, int index, Address size, Address type);

    @Import(name = "glGetAttachedShaders")
    public static native void glGetAttachedShaders(int program, int maxcount, Address count, Address shaders);

    @Import(name = "glGetAttribLocation")
    public static native int glGetAttribLocation(int program, String name);

    @Import(name = "glGetBooleanv")
    public static native void glGetBooleanv(int pname, Address params);

    @Import(name = "glGetBufferParameteriv")
    public static native void glGetBufferParameteriv(int target, int pname, Address params);

    @Import(name = "glGetFloatv")
    public static native void glGetFloatv(int pname, Address params);

    @Import(name = "glGetFramebufferAttachmentParameteriv")
    public static native void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, Address params);

    @Import(name = "glGetProgramiv")
    public static native void glGetProgramiv(int program, int pname, Address params);

    @Import(name = "glGetProgramInfoLog")
    public static native String glGetProgramInfoLog(int program);

    @Import(name = "glGetRenderbufferParameteriv")
    public static native void glGetRenderbufferParameteriv(int target, int pname, Address params);

    @Import(name = "glGetShaderiv")
    public static native void glGetShaderiv(int shader, int pname, Address params);

    @Import(name = "glGetShaderInfoLog")
    public static native String glGetShaderInfoLog(int shader);

    @Import(name = "glGetShaderPrecisionFormat")
    public static native void glGetShaderPrecisionFormat(int shadertype, int precisiontype, Address range, Address precision);

    @Import(name = "glGetTexParameterfv")
    public static native void glGetTexParameterfv(int target, int pname, Address params);

    @Import(name = "glGetTexParameteriv")
    public static native void glGetTexParameteriv(int target, int pname, Address params);

    @Import(name = "glGetUniformfv")
    public static native void glGetUniformfv(int program, int location, Address params);

    @Import(name = "glGetUniformiv")
    public static native void glGetUniformiv(int program, int location, Address params);

    @Import(name = "glGetUniformLocation")
    public static native int glGetUniformLocation(int program, String name);

    @Import(name = "glGetVertexAttribfv")
    public static native void glGetVertexAttribfv(int index, int pname, Address params);

    @Import(name = "glGetVertexAttribiv")
    public static native void glGetVertexAttribiv(int index, int pname, Address params);

    @Import(name = "glGetVertexAttribPointerv")
    public static native void glGetVertexAttribPointerv(int index, int pname, Address pointer);

    @Import(name = "glIsBuffer")
    public static native boolean glIsBuffer(int buffer);

    @Import(name = "glIsEnabled")
    public static native boolean glIsEnabled(int cap);

    @Import(name = "glIsFramebuffer")
    public static native boolean glIsFramebuffer(int framebuffer);

    @Import(name = "glIsProgram")
    public static native boolean glIsProgram(int program);

    @Import(name = "glIsRenderbuffer")
    public static native boolean glIsRenderbuffer(int renderbuffer);

    @Import(name = "glIsShader")
    public static native boolean glIsShader(int shader);

    @Import(name = "glIsTexture")
    public static native boolean glIsTexture(int texture);

    @Import(name = "glLinkProgram")
    public static native void glLinkProgram(int program);

    @Import(name = "glReleaseShaderCompiler")
    public static native void glReleaseShaderCompiler();

    @Import(name = "glRenderbufferStorage")
    public static native void glRenderbufferStorage(int target, int internalformat, int width, int height);

    @Import(name = "glSampleCoverage")
    public static native void glSampleCoverage(float value, boolean invert);

    @Import(name = "glShaderBinary")
    public static native void glShaderBinary(int n, Address shaders, int binaryformat, Address binary, int length);

    @Import(name = "glShaderSource")
    public static native void glShaderSource(int shader, String string);

    @Import(name = "glStencilFuncSeparate")
    public static native void glStencilFuncSeparate(int face, int func, int ref, int mask);

    @Import(name = "glStencilMaskSeparate")
    public static native void glStencilMaskSeparate(int face, int mask);

    @Import(name = "glStencilOpSeparate")
    public static native void glStencilOpSeparate(int face, int fail, int zfail, int zpass);

    @Import(name = "glTexParameterfv")
    public static native void glTexParameterfv(int target, int pname, Address params);

    @Import(name = "glTexParameteri")
    public static native void glTexParameteri(int target, int pname, int param);

    @Import(name = "glTexParameteriv")
    public static native void glTexParameteriv(int target, int pname, Address params);

    @Import(name = "glUniform1f")
    public static native void glUniform1f(int location, float x);

    @Import(name = "glUniform1fv")
    public static native void glUniform1fv(int location, int count, Address v);

    @Import(name = "glUniform1fv")
    public static native void glUniform1fv(int location, int count, Address v, int offset);

    @Import(name = "glUniform1i")
    public static native void glUniform1i(int location, int x);

    @Import(name = "glUniform1iv")
    public static native void glUniform1iv(int location, int count, Address v);

    @Import(name = "glUniform1iv")
    public static native void glUniform1iv(int location, int count, Address v, int offset);

    @Import(name = "glUniform2f")
    public static native void glUniform2f(int location, float x, float y);

    @Import(name = "glUniform2fv")
    public static native void glUniform2fv(int location, int count, Address v);

    @Import(name = "glUniform2fv")
    public static native void glUniform2fv(int location, int count, Address v, int offset);

    @Import(name = "glUniform2i")
    public static native void glUniform2i(int location, int x, int y);

    @Import(name = "glUniform2iv")
    public static native void glUniform2iv(int location, int count, Address v);

    @Import(name = "glUniform2iv")
    public static native void glUniform2iv(int location, int count, Address v, int offset);

    @Import(name = "glUniform3f")
    public static native void glUniform3f(int location, float x, float y, float z);

    @Import(name = "glUniform3fv")
    public static native void glUniform3fv(int location, int count, Address v);

    @Import(name = "glUniform3fv")
    public static native void glUniform3fv(int location, int count, Address v, int offset);

    @Import(name = "glUniform3i")
    public static native void glUniform3i(int location, int x, int y, int z);

    @Import(name = "glUniform3iv")
    public static native void glUniform3iv(int location, int count, Address v);

    @Import(name = "glUniform3iv")
    public static native void glUniform3iv(int location, int count, Address v, int offset);

    @Import(name = "glUniform4f")
    public static native void glUniform4f(int location, float x, float y, float z, float w);

    @Import(name = "glUniform4fv")
    public static native void glUniform4fv(int location, int count, Address v);

    @Import(name = "glUniform4fv")
    public static native void glUniform4fv(int location, int count, Address v, int offset);

    @Import(name = "glUniform4i")
    public static native void glUniform4i(int location, int x, int y, int z, int w);

    @Import(name = "glUniform4iv")
    public static native void glUniform4iv(int location, int count, Address v);

    @Import(name = "glUniform4iv")
    public static native void glUniform4iv(int location, int count, Address v, int offset);

    @Import(name = "glUniformMatrix2fv")
    public static native void glUniformMatrix2fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix2fv")
    public static native void glUniformMatrix2fv(int location, int count, boolean transpose, Address value, int offset);

    @Import(name = "glUniformMatrix3fv")
    public static native void glUniformMatrix3fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix3fv")
    public static native void glUniformMatrix3fv(int location, int count, boolean transpose, Address value, int offset);

    @Import(name = "glUniformMatrix4fv")
    public static native void glUniformMatrix4fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix4fv")
    public static native void glUniformMatrix4fv(int location, int count, boolean transpose, Address value, int offset);

    @Import(name = "glUseProgram")
    public static native void glUseProgram(int program);

    @Import(name = "glValidateProgram")
    public static native void glValidateProgram(int program);

    @Import(name = "glVertexAttrib1f")
    public static native void glVertexAttrib1f(int indx, float x);

    @Import(name = "glVertexAttrib1fv")
    public static native void glVertexAttrib1fv(int indx, Address values);

    @Import(name = "glVertexAttrib2f")
    public static native void glVertexAttrib2f(int indx, float x, float y);

    @Import(name = "glVertexAttrib2fv")
    public static native void glVertexAttrib2fv(int indx, Address values);

    @Import(name = "glVertexAttrib3f")
    public static native void glVertexAttrib3f(int indx, float x, float y, float z);

    @Import(name = "glVertexAttrib3fv")
    public static native void glVertexAttrib3fv(int indx, Address values);

    @Import(name = "glVertexAttrib4f")
    public static native void glVertexAttrib4f(int indx, float x, float y, float z, float w);

    @Import(name = "glVertexAttrib4fv")
    public static native void glVertexAttrib4fv(int indx, Address values);

    @Import(name = "glVertexAttribPointer")
    public static native void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, Address ptr);

    @Import(name = "glVertexAttribPointer")
    public static native void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, int ptr);
}