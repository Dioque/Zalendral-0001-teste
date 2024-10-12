package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProcessoImagemJson {

    public int[][] matrix;
    public Color[] colors;

    public ProcessoImagemJson(String path) {
        String jsonPath = path;
        try {
            // Carregar o JSON e mapear para Map<String, Animation>
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Animation> animationsData = mapper.readValue(
                    new File(jsonPath), new TypeReference<Map<String, Animation>>() {});

            // Processar e exibir cada animação
            for (Map.Entry<String, Animation> entry : animationsData.entrySet()) {
                Animation animation = entry.getValue();

                int[][] matrix = animation.getMatrix();
                this.matrix = matrix;

                if (animation.colors != null) {
                    Map<Integer, Color> colorMap = animation.getColorMap();
                    ArrayList<Color> nome = new ArrayList<>(colorMap.values());

                    Color[] colors = new Color[nome.size()];
                    for (int i = 0; i < colors.length; i++) {
                        colors[i] = nome.get(i);
                    }
                    this.colors = colors;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Animation {
        private int[][] matrix;

        @JsonProperty("colors")
        private Map<String, ColorData> colors; // Mapeia a propriedade JSON "colors"

        public int[][] getMatrix() {
            return matrix;
        }

        public Map<Integer, Color> getColorMap() {
            Map<Integer, Color> colorMap = new HashMap<>();
            for (Map.Entry<String, ColorData> entry : colors.entrySet()) {
                int key = Integer.parseInt(entry.getKey());
                ColorData colorData = entry.getValue();

                // Considerar o valor alpha (transparência) ao criar o objeto Color
                Color color = new Color(colorData.getR(), colorData.getG(), colorData.getB(), colorData.getA());
                colorMap.put(key, color);
            }
            return colorMap;
        }

    }

    public static class ColorData {
        private int r, g, b;
        private int a = 255; // Valor padrão para alpha é 255 (opaco)

        public int getR() {
            return r;
        }

        public int getG() {
            return g;
        }

        public int getB() {
            return b;
        }

        public int getA() {
            return a; // Adicionado o getter para o valor alpha
        }
    }
}
